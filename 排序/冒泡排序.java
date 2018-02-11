package algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 * 就是两两比较，排序
 */
public class Test {

    public static void main(String[] args) {

        int[] intArray = new int[]{4, 3, 99, 2, 87, 7, 5};
        sort2(intArray);

    }

    //正序
    public static void sort(int[] args) {
        //第一遍循环，筛选的次数,最后一次不需要筛选了
        for (int i = 0; i < args.length - 1; i++) {
            //第二遍循环，两两互相比较
            for (int j = 0; (j + 1) < args.length - i; j++) {
                if (args[j] > args[j + 1]) {
                    int temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(args));
        }
    }

    //倒序
    public static void sort2(int[] args) {
        //第一遍循环，筛选的次数
        for (int i = args.length - 1; i > 0; i--) {
            //第二遍循环，两两互相比较
            for (int j = 0; j < i; j++) {
                if (args[j] > args[j + 1]) {
                    int temp = args[j];
                    args[j] = args[j + 1];
                    args[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(args));
        }
    }

}
