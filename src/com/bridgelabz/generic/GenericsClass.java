package com.bridgelabz.generic;

public class GenericsClass<T extends Comparable> {

    public static <T extends Comparable> void testMaximum(T x, T y, T z){
        T max = x;
       if (x.compareTo(y)>0 && x.compareTo(z)>0){
           max = x;
       } else if (y.compareTo(z)>0) {
           max = y;
       }else {
           max = z;
       }
        System.out.println("Max = "+max);
    }

    public <T extends Comparable> void printMax(T x,T y, T z){
        GenericsClass.testMaximum(x,y,z);
    }
    public static void main(String[] args) {
        GenericsClass genericsClass = new GenericsClass();
        genericsClass.printMax(9,5,1);
        genericsClass.printMax(4.7F,6.9F,4.1F);
        GenericsClass.testMaximum("Apple","Peach","Banana");
    }
}
