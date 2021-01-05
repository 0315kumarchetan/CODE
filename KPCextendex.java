import java.util.Scanner;



public class KPCextendex {
    public static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz","+-*","/%^"};
    public static Scanner scn = new Scanner(System.in);
    public static int KPCextendexFunction(String s , int idx,String asf){
        if(s.length()==idx){
           System.out.println(asf);
            return 1;
        }
        int ch  = s.charAt(idx)-'0';
        int count=0;
        String code = codes[ch];
        for(int i =0 ; i<code.length();i++){
            count+= KPCextendexFunction(s,idx+1,asf+code.charAt(i));
        }
        if(idx<s.length()-1){
            int num = (s.charAt(idx)-'0')*10+s.charAt(idx+1)-'0';
            if(num==10 ||num==11){ 
                for(int i =0 ; i<codes[num].length();i++){
                    count+= KPCextendexFunction(s,idx+2,asf+codes[num].charAt(i));
                }
            }
            
        }

        return count;

    }
    public static void main(String[] args){
        String s =scn.nextLine();

        int ans = KPCextendexFunction(s,0,"");
        System.out.println(ans);
    }    
}