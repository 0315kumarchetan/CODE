import java.util.ArrayList;
import java.util.Scanner;

public class getSubsequence {
    public static ArrayList<String> getSubsequenceFunction(String s,int idx){
        if(s.length()==idx){
            ArrayList<String> base  = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = s.charAt(idx);
        ArrayList<String> smallAns =getSubsequenceFunction(s,idx+1);;
        ArrayList<String> myans = new ArrayList<>();  
        for(String  i  : smallAns){
            myans.add(i);
            myans.add(ch+i);
        }
        return myans;
    }
    public static int printSubsequenceFunction(String s , String ans){
        if(s.length()==0){
            System.out.println(ans);
            return 1;
        }

        char ch  = s.charAt(0);
        int count =0 ;
        count+=printSubsequenceFunction(s.substring(1),ans+ch);
        count+=printSubsequenceFunction(s.substring(1),ans);
        return count;
        
    }
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        String s = scn.nextLine();
    //    ArrayList<String> ans = getSubsequenceFunction(s,0);
        int ans =  printSubsequenceFunction(s,"");
       System.out.print(ans);
    }
}