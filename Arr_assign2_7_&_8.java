/* 
WAP to find the common elements between two arrays
*/

import java.io.*;
import java.util.*;
class CommonNUncommonEle {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);

    static int[] GenerateArray(int size)throws IOException{

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
        return arr;
    }

    int[] commonElement(int arr1[], int arr2[]){
        int size = 0;
        if(arr1.length > arr2.length){
            size = arr1.length;
        }
        else{
            size = arr2.length;
        }

        int arr3[] = new int[size];
        int k = 0;
        System.out.println("Common Elements :- ");
        for(int i = 0 ; i < arr1.length; i++){
            for(int j = 0 ; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    arr3[k] = arr1[i];
                    System.out.print(arr1[i] + " ");
                    k++;
                }
            }
        }
        return arr3;
    }

    void ucommonElement(int arr1[], int arr2[], int arr3[]){
        System.out.println("\n\nUnommon Elements :- ");

        Set<Integer> unionSet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int i : arr1) {
            unionSet.add(i);
        }

        for (int i : arr2) {
            unionSet.add(i);
        }

        for (int i : arr3) {
            intersectionSet.add(i);
        }

        unionSet.removeAll(intersectionSet);

        for(int x : unionSet){
            System.out.print(x + " ");
        }
    }
    
    public static void main(String[] args)throws IOException{

        System.out.print("Enter the size of first array :- ");
        int size1 = Integer.parseInt(br.readLine());
        int arr1[] = GenerateArray(size1);

        System.out.print("\nEnter the size of Second array :- ");
        int size2 = Integer.parseInt(br.readLine());
        int arr2[] = GenerateArray(size2);

        CommonNUncommonEle obj = new CommonNUncommonEle();
        int commonArr[] = obj.commonElement(arr1, arr2);
        obj.ucommonElement(arr1, arr2, commonArr);
    }
}
