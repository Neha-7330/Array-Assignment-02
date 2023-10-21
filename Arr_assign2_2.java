/* 
WAP to find the number of even and odd integers in a given array.
*/

import java.io.*;
import java.util.*;

class EvenOddCount {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array :- ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.print("Enter the Elements (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");
        
        int i = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            i++;
        }

        int count = 0;
        for(int j = 0; j < arr.length; j++){
            if (arr[j] % 2 == 0){
                count++;
            }
        }

        System.out.println("Number of Even elemets :- " + count);
        System.out.println("Number of Odd elements :- " + (arr.length - count));
    }
}
