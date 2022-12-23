package com.test;

import com.test.eQueen.EightQueen;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        EightQueen a= new EightQueen(1,1);

        a.solve(0);

        System.out.println(a.solveNum);

    }
}
