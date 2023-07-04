package com.bridgelabz.generic;

public class GenericsClass<T extends Comparable> {

    public static <T extends Comparable> T testMaximum(T ... elements){
        T max = elements[0];
        for (T element:elements) {
            if (element.compareTo(max)>0){
                max = element;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Find Maximum Problem using Generics");
        System.out.println(testMaximum(41,92,2,3,100,54));
        System.out.println(testMaximum(4.7F,8.9F,9.0F,1.9F));
        System.out.println(testMaximum("Apple","Peach","Mango","Banana"));
    }
}
