package algorithm;

import java.util.Arrays;

/**
 * 选择排序
 * 将数组分为0..n和n..k部分，前面为已排序，后面未排序
 * 在后面找出最小的放到前面排序
 */
public class Test {

    public static void main(String[] args) {

        int[] intArray = new int[]{4, 3, 99, 2, 87, 7, 5};
        sort(intArray);

    }

    public static void sort(int[] args) {
        for (int i = 0; i < args.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < args.length; j++) {
                if (args[index] > args[j]) {
                    index = j;
                }
            }
            if (index != i) {
                int temp = args[i];
                args[i] = args[index];
                args[index] = temp;
            }
            System.out.println(Arrays.toString(args));
        }

        System.out.println("final : " + Arrays.toString(args));
    }

}
