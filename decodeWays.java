import java.util.Scanner;

public class decodeWays {
    public static int decodewaysFunction(String s,int idx ,String asf,int[] dp){
        if(idx==s.length()){
            System.out.print(asf+" , ");
            return 1;
        }


        if(s.charAt(idx)==0)return 0;

        int count=0;
        if(dp[idx]!=0){
            return dp[idx];
        }
        count+=decodewaysFunction(s,idx+1,asf+(char)(s.charAt(idx)-'1'+'a'),dp);
        if(idx<s.length()-1){
            int num = (s.charAt(idx)-'0')*10 + (s.charAt(idx+1)-'0');
            if(num<=26){
                count+=decodewaysFunction(s,idx+2,asf+(char)(num-1+'a'),dp);
            }
                }

       
//"111111111111111111111111111111111111111111111"
        return dp[idx]=count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int[] dp = new int[s.length()];
        int ans = decodewaysFunction(s,0,"",dp);
        System.out.println("->"+ans);
    }
    
}