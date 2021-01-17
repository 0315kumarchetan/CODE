import java.util.Scanner;
import java.util.Arrays;
public class CryptoArith {
    public static Scanner scn = new Scanner(System.in);
    public static String s1;
    public static String s2;
    public static String s3;
    public static int[] mapping;
    public static boolean[] isNumberTaken;
    public static int StringtoNumber(String str){
        int res =0;
        for(int i =0 ; i< str.length();i++){  
            res=10*res+mapping[str.charAt(i)-'a'];
        }
        return res;
    }
    public static int CryptoArithFun_2(String str , int idx){
        if(idx==str.length()){
            int num1=StringtoNumber(s1);
            int num2=StringtoNumber(s2);
            int num3=StringtoNumber(s3);

            if(num3==num1+num2){
                System.out.println(" "+num1);
                System.out.print("+");
                System.out.println(" "+num2);
                System.out.println("------");
                System.out.println(" "+num3);
                System.out.println();
                
                return 1;
            }
            return 0;
        }
        int count=0;
        
        char ch = str.charAt(idx);
        for(int i =0;i<10;i++){
            if(!isNumberTaken[i]){
                isNumberTaken[i]=true;
                mapping[ch-'a']=i;
                
                count+=CryptoArithFun_2(str,idx+1);
                
                isNumberTaken[i]=false;
                mapping[ch-'a']=-1;
            }

        }
        return count;
    }
    public static int CryptoArithFun_1(String str){
        
        int freq= 0 ; 
        for(int i = 0 ; i< str.length();i++){
            freq |= (1<<(str.charAt(i)-'a'));
        }
        str= "";
         for(int i = 0 ; i < 32 ; i++){
             int mask = 1<<i;
             if((freq & mask)!=0){
                 str+=(char)(i+'a');
             }
         } 
         
         int ans = CryptoArithFun_2(str,0); 
         return ans;
    }

     public static void main(String[] args){
          s1=scn.nextLine();
          s2=scn.nextLine();
          s3=scn.nextLine();
         mapping = new int[26];
         Arrays.fill(mapping,-1);
         isNumberTaken = new boolean[10];
         String str = s1+s2+s3;
       
         int ans = CryptoArithFun_1(str);
         System.out.println(ans);


         
     } 
    
}