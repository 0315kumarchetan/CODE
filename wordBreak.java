import java.util.*;
public class wordBreak {
    public static Scanner scn = new Scanner(System.in);
    public static void wordBreak_Fun(String str , String ans , HashSet<String> dict,int length1){
        if(str.length()==0){
            System.out.println(ans);
            return ;
        }

        for(int len = 1 ; len<=str.length();len++){
            String word  =  str.substring(0, len);
            if(dict.contains(word)){
                wordBreak_Fun(str.substring(len),ans+word+" ",dict,length1);
            }
        }
    }
    public static void  main(String[] args){
        int n = scn.nextInt();
        HashSet <String> dict= new HashSet<>();
        for(int i = 0 ; i < n ; i++){
            dict.add(scn.next());
        }
        int len=0;
        for(String str : dict){
             len = Math.max(len,str.length());
        }
        String sentence = scn.next();
        wordBreak_Fun(sentence,"",dict,len);
    }
  

    
}