package com.test;

import com.test.eQueen.EightQueen;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        int queenNum =Integer.valueOf( args[0] );

        int chessSize = Integer.valueOf(args[1]);

        EightQueen a= new EightQueen(queenNum,chessSize);

        a.solve(0);

        System.out.println(a.solveNum);

    }
}
