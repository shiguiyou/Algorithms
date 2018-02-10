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
}
