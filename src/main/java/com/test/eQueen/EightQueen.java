package com.test.eQueen;

public class EightQueen {

    private int n = 0;
    //board width
    private int sizeW=0;
    //board height
    private int sizeH=0;

    /**
     * init Game
     * @param n Queen number
     * @param sizeW
     * @param sizeH
     */
    public void EightQueen(int n , int sizeW  ,int sizeH){
        this.n = n;
        this.sizeW = sizeW;
        this.sizeH = sizeH;
    }

    /**
     * if the queen is threatened others return false
     * @return isThreaten
     */
    public boolean checkthreaten( ){

        return false;
    }

}
