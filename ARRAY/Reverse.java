package ARRAY;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        
    int[] arr = new int[5];
    arr[0] = 58;
    arr[1] = 32;
    arr[2] = 44;
    arr[3] = 24;
    arr[4] = 10;
    int[] Reverse = new int[arr.length];

    for(int i=0;i<arr.length;i++){
        Reverse[i]=arr[arr.length -1-i];

    }
    System.out.println(Arrays.toString(Reverse));
    }
}
