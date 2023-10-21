/* 
Write a java program to merge two given array
*/

import java.io.*;
import java.util.*;

class mergeArray{
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    static int[] generateArray(int size)throws IOException{

        int arr[] = new int [size];
        System.out.print("Enter the Elements (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");
        int i = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            i++;
        } 
        return arr;
    }

    public static void main(String[] args)throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of first array :- ");
        int size1 = Integer.parseInt(br.readLine());
        int arr1[] = generateArray(size1); 

        System.out.print("Enter the Size of second array :- ");
        int size2 = Integer.parseInt(br.readLine());
        int arr2[] = generateArray(size2);

        int size = (arr1.length + arr2.length);
        
        int arr3[] = new int[size];
        for(int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
    
        int index = 0;
        for(int i = arr1.length ; i < size; i++){
            arr3[i] = arr2[index];
            index++;
        }

        System.out.print("Merged Array = " );
        for(int x : arr3){
            System.out.print(x + " ");
        }
    }
}