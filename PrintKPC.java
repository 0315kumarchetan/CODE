import java.util.Scanner;
public class PrintKPC {
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void PrintKPCfunction(String s ,String asf,int idx){
        if(idx==s.length()){
            System.out.print(asf+" ,");
            return ;
        }
        int number = s.charAt(idx)-'0';
        String str = codes[number];
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            PrintKPCfunction(s, asf+ch,idx+1);  
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String asf = "";
        PrintKPCfunction(s,asf,0);
      
    }
    
}