import java.util.Scanner;
public class CoinChangeCombinationSingle {
    public static Scanner scn = new Scanner(System.in);
    public static int CoinChangeCombinationSingleFunction(int[] arr ,int target ,int idx,String ans){
        if(target==0){
            System.out.println(ans);
            return 1;
        }

        int count =0 ;
        for(int i =idx ; i<arr.length;i++){
            if(target-arr[i]>=0)
            count+=CoinChangeCombinationSingleFunction(arr,target-arr[i],i+1,ans+String.valueOf(arr[i]));

        }
        return count;
    }
    public static void main(String[] args){
        int n =scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i<n;i++){
            arr[i]=scn.nextInt();
        }

        int ans = CoinChangeCombinationSingleFunction(arr,target,0,"");
        System.out.println(ans);


    }
    
}