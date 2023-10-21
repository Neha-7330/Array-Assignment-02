/* 
Write a program to createan array of'n integer.
Where 'n' value should be taken from user.
insert the vlues fron user and find the sum of all elements in the array
*/

import java.io.*;
import java.util.*;

class ArrEleSum{
    public static void main(String[] args)throws IOException{

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array :- ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        
        System.out.print("Enter the Elements (Seperated by space):- ");
        String num_str = br.readLine();
        StringTokenizer st = new StringTokenizer(num_str, " ");

        int i = 0;
        int sum = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            sum += num;
            i++;
        }

        System.out.println("\nSum of Array Elements = " + sum);
    }
}