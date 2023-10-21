/* 
WAP to print the element whose addition of digit is even.
*/

import java.io.*;
import java.util.*;

class splitEle {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter thr size of Array :- ");
        int size = Integer.parseInt(br.readLine());
        int arr[] = new int[size];

        System.out.print("Enter the Elements (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");

        int evenSumEle[] = new int[size];
        int i = 0;
        int index = 0;
        while(st.hasMoreTokens()){
            int sum = 0;
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            while(num != 0){
                int rem = num % 10;
                sum += rem;
                num = num / 10;
            }
            if(sum % 2 == 0){
                evenSumEle[index] = arr[i];
                index++;
            }
        }

        System.out.print("Elements who's sum of digit is even :-" );
        for(int j = 0; j < evenSumEle.length; j++){
            if(evenSumEle[j] != 0)
                System.out.print(evenSumEle[j] + " ");
        }
    }
}