import java.util.Scanner;
public class CoinChangeCombSingleCoinSubseq {
    public static Scanner scn = new Scanner(System.in);
    public static int CoinChangeCombSingleCoinSubseqFunction(int[]arr,int idx , int target ,String ans){
        if(idx==arr.length || target==0){
            if(target==0){
                System.out.println(ans); 
                return 1; 
            }
            return 0;    
        }
        int count=0;
        if(target-arr[idx]>=0)
            count+=CoinChangeCombSingleCoinSubseqFunction(arr, idx+1, target-arr[idx], ans+String.valueOf(arr[idx]));
        count+=CoinChangeCombSingleCoinSubseqFunction(arr, idx+1, target, ans);
        return count;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr =new int[n];
        for(int i =0 ; i < n ; i++){
            arr[i]=scn.nextInt();
        }
       int ans = CoinChangeCombSingleCoinSubseqFunction(arr,0,target,"");
       System.out.println(ans);

        

    }
    
}