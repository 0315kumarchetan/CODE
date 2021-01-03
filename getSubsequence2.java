import java.util.Scanner;
import java.util.ArrayList;
public class getSubsequence2 {
    public static ArrayList<String> getSubsequence2Function(String s){
        if(s.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = s.charAt(0);
        ArrayList<String> smallRes = getSubsequence2Function(s.substring(1));
        ArrayList<String> myRes = new ArrayList<>();
        
        for(String i : smallRes){
            myRes.add(i);
            myRes.add(ch+i);
        }
        return myRes;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
       ArrayList<String> ans =  getSubsequence2Function(s);
       for(String i : ans){
           System.out.print(i+" ");
       }
    }
    
}