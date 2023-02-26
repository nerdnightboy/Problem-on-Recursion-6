/**
 * Recursion_on_Arrays
 */
import java.util.*;
public class Recursion_on_Arrays {

    static void printArray(int [] arr, int idx){
        //base case
        if(idx == arr.length){
            return;
        }

        //self work
        System.out.println(arr[idx]);

        //recursive work
        printArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int [] arr = {1,5,6,4,8,4,5};
        printArray(arr, 0);
    }
}