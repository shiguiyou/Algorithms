package algorithm;

/**
 * 在字符串中找出第一个只出现一次的字符。如输入"abaccdeff"，则输出'b'
 */
public class Test {

    public static void main(String[] args) {

        System.out.print("第一个只出现一次的字符：" +
                firstNotRepeatingChar("abaccdeff"));

    }

    /*
    默认解法是for循环嵌套一个for循环来查找某个char是否出现第二次，时间复杂度位O(n²)，不可取

    由于字符(char)是一个长度为8的数据类型（即a在ascii码中代表97），长度为256，所以我们可以自建一个哈希表
    key为ascii码，值为出现的次数，所以只要2次循环就可以得出结果
    时间复杂度为O(n)，固定大小数组，空间复杂度为O(1)
     */
    static char firstNotRepeatingChar(String str) {
        if (str != null && str.length() > 0) {
            int[] hashTab = new int[256];
            for (int i = 0; i < str.length(); i++) {
                hashTab[str.charAt(i)]++;
            }

            for (int i = 0; i < str.length(); i++) {
                if (hashTab[str.charAt(i)] == 1) {
                    return str.charAt(i);
                }
            }
            return '\0';
        } else {
            return '\0';
        }
    }

    /*
    相关题目
    
    定义一个函数，输入两个字符串，从第一个字符串中删除在第二个字符串中出现过的所有字符。
    例如，从第一个字符串"We are students."中删除在第二个字符串"aeiou"中出现过的字符得到的结果是"W r Stdnts."。
    
    定义一个函数，删除字符串中所有重复出现的字符。
    例如，输入"google"，删除重复的字符之后的结果是"gole"。
    
    在英语中，如果两个单词中出现的字母相同，并且每个字母出现的次数也相同，那么这两个单词互为变位词（Anagram）。
    例如，silent与listen、evil与live互为变位词。
    请完成一个函数，判断输入的两个字符串是不是互为变位词。
     */
}
