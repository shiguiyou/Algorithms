package algorithm;

/**
 * 求斐波那契数列的第n项
 * 写一个函数，输入n，求斐波那契数列的第n项。斐波那契数列的定义如下：
 * F(0)=0，F(1)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）
 */
public class Test {

    public static void main(String[] args) {
        System.out.print(Fibonacci2(5));
    }

    /*
    如果简单的使用递归，那么将会占用很多的时间和空间

    我们可以把计算过的值存储下来，循环计算，时间复杂度仅为O(n)
     */
    private static long Fibonacci(long n) {
        int[] result = {0, 1};
        if (n < 2) {
            return result[(int) n];
        }

        int fibOne = 1;
        int fibTwo = 2;
        int fibN = 0;
        for (int i = 2; i <= n; i++) {
            fibN = fibOne + fibTwo;
            fibOne = fibTwo;
            fibTwo = fibN;
        }

        return fibN;
    }

    /*
    相关题目：青蛙跳台问题
    一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个n级的台阶总共有多少种跳法。

    1级->1种 2级->2种 3级->3种 ...
     */
    private static long Fibonacci2(long n) {
        int[] result = {0, 1,2};
        if (n < 3) {
            return result[(int) n];
        }

        int fibOne = 1;
        int fibTwo = 2;
        int fibN = 0;
        for (int i = 3; i <= n; i++) {
            fibN = fibOne + fibTwo;
            fibOne = fibTwo;
            fibTwo = fibN;
        }

        return fibN;
    }

}