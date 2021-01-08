import java.util.Scanner;
public class CoinChangePermutationInfi {

    public static Scanner scn = new Scanner(System.in);
    public static int CoinChangePermutationInfiFunction(int[] arr ,int target,String ans){
        if(target==0){
            System.out.println(ans);
            return 1;
        }   
        int count =0 ;
        
        for(int ele : arr){
            if(target-ele>=0)
                count+=CoinChangePermutationInfiFunction(arr,target-ele,ans+String.valueOf(ele));
        }
        return count;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr =new int[n];
        for(int i =0 ; i < n ; i++){
            arr[i]=scn.nextInt();
        }
       int ans = CoinChangePermutationInfiFunction(arr,target,"");
       System.out.println(ans);
    }   
}