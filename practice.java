import java.util.Scanner;
import java.util.ArrayList;
class practice
{
    public static  Scanner scn = new Scanner(System.in);
    public static ArrayList<String> subSequence(String s){
        if(s.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = s.charAt(0);
       ArrayList<String> smallAns =  subSequence(s.substring(1));
       ArrayList<String> myAns = new ArrayList<>();
       for(String i: smallAns){
           myAns.add(i);
           myAns.add(ch+i);
       }
        return myAns;

    }

    
    public static void main(String args[])
    {
        String s = scn.nextLine();
        ArrayList<String> ans = subSequence(s);
        System.out.println(ans);
        
    }
}