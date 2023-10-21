/* 
Write a java program to find the sum of even and odd number in an array.
*/

import java.io.*;
import java.util.*;

class Arr_assign2_3 {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the Size of array :- ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.print("Enter the elements (seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");
        int i = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            i++;
        }

        int evenSum = 0;
        int oddSum = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[j] % 2 == 0){
                evenSum += arr[j];
            }
            else{
                oddSum += arr[j];
            }
        }
        System.out.println("Sum of Even Numbers = " + evenSum);
        System.out.println("Sum of Odd Numbers = " + oddSum);
    }
}
