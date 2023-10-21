/* 
WAP to search a specific elements from an array nd return its index.
*/

import java.io.*;
import java.util.*;

class ReturnIndexOfEle {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array :- ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];

        System.out.print("Enter the elements (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st  = new StringTokenizer(numStr, " ");
        int i = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            i++;
        }

        System.out.print("Enter element to search : ");
        int numSearch = Integer.parseInt(br.readLine());

        for(int j = 0; j < arr.length; j++){
            if(arr[j] == numSearch){
                System.out.println("Element found at index at : " + j);
                break;
            }
        }
    }
}
