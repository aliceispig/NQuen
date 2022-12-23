package com.test;

import com.test.eQueen.EightQueen;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        EightQueen a= new EightQueen(8,8);

        a.run(0);

        ArrayList<int[]>  result =a.getResult();

        for (int i=0; i<result.size();i++){
            System.out.println("");
            for (int j=0; j<result.get(i).length; j++){

                System.out.print(result.get(i)[j]+" ");
            }

        }
    }
}
