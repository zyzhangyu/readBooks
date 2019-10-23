package com.company;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        BinarySearch.tempMethod(new String[0]);

//        StdDraw.circle(1,1,2);

//        int[] tempInts = StdIn.readInts();

        BinarySearch.binarySearchDemo("tinyT.txt");

        int N = 100;
        StdDraw.setXscale(0,100);
        StdDraw.setYscale(0,10000);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i<=100; i++){
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i, i*Math.log(i));
        }

    }
}
