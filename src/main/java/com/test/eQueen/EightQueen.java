package com.test.eQueen;

import java.util.ArrayList;

public class EightQueen {

    private int queenNum = 0;
    //chess size
    private int chessSize=0;

    public  EightQueen(int queenNum , int chessSize ){
        this.queenNum = queenNum;
        this.chessSize = chessSize;

    }

    public void run(){
        int[][] chess = new int[chessSize][chessSize];
    }

    public boolean solve(int[][] chess , int column ){
        if(column > chessSize){
            return true;
        }

        return false;
    }


    public boolean check( int[][] chess,int x , int y  ){


    }

}
