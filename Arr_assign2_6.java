/* 
Find the maximum Element from the array
*/

import java.io.*;
import java.util.*;

class maxElement {
    public static void main(String[] srgs)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the size of array :- ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.print("Enter the elements (Seperated by space) :- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " " );
        int i = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            i++;
        }

        int maxEle = arr[0];
        for(int j = 0; j < arr.length; j++){
            if(maxEle < arr[j]){
                maxEle = arr[j];
            }
        }
        System.out.println("Max Element = " + maxEle);
    }
}
