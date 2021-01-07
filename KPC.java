import java.util.Scanner;
import java.util.ArrayList;
public class KPC {
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> KPCfunction(String s){
        
        if(s.length()==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        int ch = s.charAt(s.length()-1)-'0';
        ArrayList<String> smallAns = KPCfunction(s.substring(0,s.length()-1));
        ArrayList<String> myans = new ArrayList<>();
         
        String code = codes[ch];

        for(int i = 0 ;i < code.length();i++){
            for(int j = 0; j < smallAns.size();j++){
                    myans.add(code.charAt(i)+smallAns.get(j));
            }
        }


        return myans;

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

       ArrayList<String> ans =  KPCfunction(s);
       System.out.print(ans);
    }
    
}