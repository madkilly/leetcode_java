package com.zhu.sword;

import com.zhu.utils.BubbleSort;
import org.junit.Test;

import java.util.HashSet;
import java.util.Random;

public class TwoDimensionalArraySearch {

    /**
     * 随机生成一个顺序二维数组，左上最小，右下最大
     *
     * @return
     */
    public int[][] genArrary() {
        Random r = new Random();
        HashSet<Integer> set = new HashSet<Integer>(25);
        while (set.size() < 25) {
            set.add(r.nextInt(99));
        }

        set.forEach((value) -> {
            System.out.print(value + "  ");
        });
        System.out.println();

        Integer[] raw = set.toArray(new Integer[set.size()]);

        BubbleSort.sort(raw);

        int[] intArray = new int[raw.length];
        for (int i = 0; i < raw.length; i++) {
            intArray[i] = raw[i].intValue();
            System.out.print(intArray[i] + "  ");
        }


        int[][] result = new int[5][5];

        int row = result.length;
        int column = result[0].length;
        int j = 0;
        System.out.println();

        for (int m = 0; m < row; m++) {
            System.out.println();
            for (int n = 0; n < column; n++) {
                result[m][n] = intArray[j];
                System.out.print(intArray[j] + "  ");
                j++;
            }
        }
        System.out.println();
        return result;
    }

    public void D2Search(int[][] map, int target) {
        int row = map.length;
        int column = map[0].length;
        //起点右上角
        int x = 0;
        int y = column - 1;
        while (x >= 0 && y < row) {
            if (map[x][y] == target) {
                System.out.println("result is " + x + "   " + y);
                break;
            } else if (map[x][y] > target) {
                y--;
            } else if (map[x][y] < target) {
                x++;
            }
        }
    }

    @Test
    public void testSearch() {
        int[][] ints = genArrary();
        int target = ints[2][3];
        D2Search(ints, target);


    }
}
