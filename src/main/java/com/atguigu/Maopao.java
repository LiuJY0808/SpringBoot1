package com.atguigu;

public class Maopao {
    public static void main(String[] args) {
        int[] deom = new int[]{50,20,99,150,30,11};
        for (int i = 0; i <deom.length ; i++) {
            for (int j = 0; j <deom.length-i-1 ; j++) {
                if (deom[j] < deom[j+1]){
                    int deom2 = deom[j];
                    deom[j] = deom[j+1];
                    deom[j+1] = deom2;
                }

            }
        }
        for (int deom3:deom){
            System.out.println(deom3);
        }
    }
}
