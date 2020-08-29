package com.learn.java;

public class Main {

    public static void main(String[] args) {

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value is = " + minIntValue);
        System.out.println("Integer Maximum value is = " + maxIntValue);

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value is = " + minByteValue);
        System.out.println("Byte Maximum value is = " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value is = " + minShortValue);
        System.out.println("Short Maximum value is = " + maxShortValue);

        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        long myLongValue = 100L;
        System.out.println("Long Minimum value is = " + minLongValue);
        System.out.println("Long Maximum value is = " + maxLongValue);

        byte newByteValue = (byte) (minByteValue / 2);
        short newShortValue = (short) (minShortValue / 2);

        System.out.println(newByteValue);

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum value is = " + minFloatValue);
        System.out.println("Float Maximum value is = " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum value is = " + minDoubleValue);
        System.out.println("Double Maximum value is = " + maxDoubleValue);

        float myFloat=5f/3f;
        double myDouble=5d/3d;
        int myInt=5/3;

        System.out.println("Float "+myFloat+" , double "+myDouble+" , Int "+myInt);

        char myChar='D';
        char myUnicodeChar='\u0044';
        System.out.println("Unicode char"+myUnicodeChar);

        boolean isCustFemale=true;
        String myString="10";
        int exInt=50;
        System.out.println("The concatination of int and String is : " +myString+exInt);
    }
}
