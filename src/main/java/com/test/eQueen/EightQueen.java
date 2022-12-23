package com.test.eQueen;

import java.util.ArrayList;

public class EightQueen {

    private int queenNum = 0;
    //chess size
    private int chessSize=0;
    int[] array ;
    public int solveNum =0;
    public  EightQueen(int queenNum , int chessSize ){
        this.queenNum = queenNum;
        this.chessSize = chessSize;

        array = new int[chessSize];
    }


    public void solve(int n ){
        if (n == queenNum) {
            print();
            return;
        }
        for (int i = 0; i < chessSize; i++) {

            array[n] = i;
            if (check(n)) {
                solve(n + 1);
            }
        }

    }


    public boolean check( int n ){
        for (int i = 0; i < n; i++) {

            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;


    }

    private void print() {

        solveNum++;
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
    }


}
