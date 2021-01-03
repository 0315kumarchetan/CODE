import java.util.Scanner;
// import java.util.ArrayList;

public class findAllIndex {

    public static int[] findAllIndexFunction(int[] arr , int data , int count , int idx){
        if(idx==arr.length)return new int[count];
        if(arr[idx]==data)count++;
        int[] smallAns = findAllIndexFunction(arr, data, count, idx+1);
        if(arr[idx]==data)smallAns[count-1]=idx;
        return smallAns;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int data = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++) {
            arr[i] = scn.nextInt();
        }

        int[] ans  = findAllIndexFunction(arr , data , 0 , 0);
        for(int i : ans){
            System.out.println(i);
        }

        }
    
}