import java.util.Scanner;

public class PrintPermutation{

    public static void PrintPermutationFunction(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i = 0 ; i< s.length(); i++){
            char ch = s.charAt(i);
            PrintPermutationFunction(s.substring(0, i)+s.substring(i+1),ans+ch);
        }

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        PrintPermutationFunction(s,"");
    }

}