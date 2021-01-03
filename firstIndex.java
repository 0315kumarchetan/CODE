import java.util.Scanner;
public class firstIndex {
    public static int firstIndexFunction(int[] arr , int data , int idx){
        if(idx ==arr.length)return -1;
        if(arr[idx]==data)return idx;
        return firstIndexFunction(arr,data,idx+1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int data = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n ; i++){
            arr[i] = scn.nextInt();
        }
        int ans  = firstIndexFunction(arr,data,0);
        System.out.println(ans);
    }
    
}