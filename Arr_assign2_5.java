/* 
WAP  to take size of array from user and also take integer elements from user and 
find minimum element from the array.
*/

import java.io.*;
import java.util.*;

class minElement {
    public static void main(String[] args)throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the the size of array :- ");
        int size = Integer.parseInt(br.readLine());

        int arr[] = new int[size];
        System.out.print("Enter the Elements (Seperated by Space):- ");
        String numStr = br.readLine();
        StringTokenizer st = new StringTokenizer(numStr, " ");
        int i = 0;
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            i++;
        }

        int minNum = arr[0];
        for(int j = 0; j < arr.length; j++){
            if(minNum > arr[j]){
                minNum = arr[j];
            }
        }
        System.out.println("Min Element = " + minNum);

    }   
}
