import java.util.Scanner;
public class CoinChangeCombInfiCoinSubseq {
    public static Scanner scn = new Scanner(System.in);
    public static int CoinChangeCombInfiCoinSubseqFunction(int[] arr ,int target ,int idx,String ans){
        if(idx==arr.length || target==0){
            if(target==0){
                System.out.println(ans);
                return 1;
            }        
            return 0;
        }
        int count =0 ;
            if(target-arr[idx]>=0)
                count+=CoinChangeCombInfiCoinSubseqFunction(arr,target-arr[idx],idx,ans+String.valueOf(arr[idx]));
            count+=CoinChangeCombInfiCoinSubseqFunction(arr,target,idx+1,ans);

        return count;
    }
    public static void main(String[] args){
        int n =scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n;i++){
            arr[i]=scn.nextInt();
        }

        int ans = CoinChangeCombInfiCoinSubseqFunction(arr,target,0,"");
        System.out.println(ans);


    }
    
}