import java.util.Scanner;

public class PrintPermutationExtended{

    public static void PrintPermutationExtendedFunction(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" , ");
            return;
        }
        boolean[] arr =new boolean[26];
        for(int i = 0 ; i< s.length(); i++){ 
            char ch = s.charAt(i);
            if(!arr[ch-'a']){
                arr[ch-'a']=true;
                PrintPermutationExtendedFunction(s.substring(0, i)+s.substring(i+1),ans+ch);
            }
            
            
            }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        
        PrintPermutationExtendedFunction(s,"");
    }

}