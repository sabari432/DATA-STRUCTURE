package ARRAY;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 58;
        arr[1] = 32;
        arr[2] = 44;
        arr[3] = 24;
        arr[4] = 10;

        System.out.println("array elements are:");
        for(int i=0;i<arr.length;i++)
        {
            System.err.println(i);

        }
        System.out.println("Ther array index 2nd element is:"+arr[2]);

        arr[2]=100;
        System.out.println("The updated index 2nd element is:"+arr[2]);

           }

    }
