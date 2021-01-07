import java.util.Scanner;

public class PrintPermutation {
    public static Scanner scn = new Scanner(System.in);
    public static int  PrintPermutationFunction(String s ,String asf){
        if(s.length()==0){
            System.out.println(asf);
            return 1;
        }
        
        int count = 0; 
        for(int i = 0 ;i < s.length() ;i++){
            char ch = s.charAt(i);
            count+=PrintPermutationFunction(s.substring(0,i)+s.substring(i+1), asf+ch);
        }
        return count;
    }
    public static void main(String[] args){
        String s = scn.nextLine();
        int ans = PrintPermutationFunction(s,"");
        System.out.println(ans);

    }
}