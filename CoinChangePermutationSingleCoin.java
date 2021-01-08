import java.util.Scanner;
public class CoinChangePermutationSingleCoin {
    public static Scanner scn = new Scanner(System.in);
    public static int CoinChangePermutationSingleCoinFunction(int[] arr , int target ,String ans){
        if(target==0){
            System.out.println(ans);
            return 1;
        }
        int count=0;
        
        for(int i = 0 ; i<arr.length;i++){
            int a= arr[i];
            if(arr[i]>0 &&  target-a>=0){
                arr[i]=-arr[i];
                count+=CoinChangePermutationSingleCoinFunction(arr, target-a, ans+String.valueOf(a));
                arr[i]=-arr[i];
            }
            
        }
        return count;
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int ans = CoinChangePermutationSingleCoinFunction(arr,target,"");
        System.out.println(ans);

    }
    
}