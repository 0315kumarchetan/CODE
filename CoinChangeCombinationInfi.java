import java.util.Scanner;
public class CoinChangeCombinationInfi {
    public static Scanner scn = new Scanner(System.in);
   public static int CoinChangeCombinationInfiFunction(int[] arr,int target,int idx ,String ans){
    if(target==0){
        System.out.println(ans);
        return 1;
    }
    int count =0 ;
    for(int  i =idx ; i< arr.length;i++){
        if(target-arr[idx]>=0)
        count+=CoinChangeCombinationInfiFunction(arr,target-arr[i],i,ans+String.valueOf(arr[i]));
    }
    return  count;
    }

    public static void main(String[] args){
        int n =scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n;i++){
            arr[i]=scn.nextInt();
        }

        int ans = CoinChangeCombinationInfiFunction(arr,target,0,"");
        System.out.println(ans);
    }
    
}