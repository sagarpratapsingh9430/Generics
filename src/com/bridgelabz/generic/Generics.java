package com.bridgelabz.generic;

public class Generics {
    void maxNumberInInteger(Integer x, Integer y, Integer z){
        int max = x;
        if (x.compareTo(y)>0 && x.compareTo(z)>0){
            max = x;
        } else if (y.compareTo(z)>0) {
            max = y;
        }else {
            max = z;
        }
        System.out.println("Maximum number from " + x +", " +y +" and "+ z + " is: " + max);
    }
    void maxNumberInFloat(Float x, Float y, Float z){
        float max = x;
        if (x.compareTo(y)>0 && x.compareTo(z)>0){
            max = x;
        } else if (y.compareTo(z)>0) {
            max = y;
        }else {
            max = z;
        }
        System.out.println("Maximum number from " + x +", " +y +" and "+ z + " is: " + max);
    }
    public static void main(String[] args) {
        System.out.println("Find Maximum Problem using Generics");
       Generics generics = new Generics();
       
       generics.maxNumberInInteger(5,1,9);

       generics.maxNumberInFloat(4.0F,5.6F,2.7F);
    }
}
