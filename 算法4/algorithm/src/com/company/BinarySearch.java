package com.company;


import com.sun.tools.classfile.ConstantPool;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {


    public static int rank(int key, int[] a){


        StdOut.print("执行了");
        StdOut.print(Arrays.toString(a));
        //二分查找条件必要条件:数组必须是有序的
        int low = 0;
        int hight = a.length - 1;

        StdOut.print("hight是" + hight);
        //循环条件: 被查找的键，要么不存在，要么在a[low...height]之中
        while (low <= hight) {

            int mid = low + (hight - low) / 2;
            if (key < a[mid]) {
                hight = mid - 1;
            } else if (key > a[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return  -1;


    }

    public static void binarySearchDemo(String filePath) {
        System.out.println("aaa");

        int[] whitelist = In.readInts(filePath);
        StdOut.print(Arrays.toString(whitelist));
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()){

            //读取值,如果不存在于白名单中则将其打印
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0){
                StdOut.println(key);
            }else {
                StdOut.print("查到了");
            }
        }
    }
}
