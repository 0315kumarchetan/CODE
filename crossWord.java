import java.util.Scanner;
public class crossWord {
    public static Scanner scn = new Scanner(System.in);
    public static boolean isPossibleToPlaceH(char[][] arr , String word , int r , int c){
        for(int i = 0 ; i < word.length();i++){
            if(c+i>=arr[0].length)return false;
            if(arr[r][c+i]!='-' && arr[r][c+i]!=word.charAt(i))return false;
        }
        return true;
    }
    public static boolean[] placeH(char[][] arr , String word , int r , int c){
        boolean[] charLoc = new boolean[word.length()];
        for(int i = 0 ; i< word.length();i++){
            if(arr[r][c+i]=='-'){
                charLoc[i]=true;
                arr[r][c+i]=word.charAt(i);
            }
        }
       return charLoc;  
    }
    public static void  unPlaceH(char[][] arr , String word , int r , int c ,boolean[] charLoc){
        for(int i = 0 ; i < word.length();i++){
            if(charLoc[i]){
                arr[r][c]='-';
            }
        }      
    }
    public static boolean isPossibleToPlacev(char[][] arr,String word , int r , int c){
        
        for(int i = 0 ; i < word.length();i++){
            if(r+i>=arr.length)return false;
            if(arr[r+i][c]!='-' && arr[r+i][c]!=word.charAt(i))return false;
        }
        return true;
    }
    public static boolean[] placeV(char[][] arr , String word , int r , int c){
        boolean[] charLoc = new boolean[word.length()];
        for(int i = 0 ; i < word.length();i++){
            if(arr[r+i][c]=='-'){
                charLoc[i]=true;
                arr[r+i][c]=word.charAt(i);
            }
        }
        return charLoc;
    }
    public static void unPlaceV(char[][] arr , String word , int r , int c ,boolean[] charLoc){
        for(int i = 0 ; i < word.length();i++){
            if(charLoc[i]){
                arr[r][c]='-';
            }
    }
}
    public static void print(char[][] arr){
        for(int i =0 ; i < arr.length;i++){
            for (int j = 0 ; j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int crossWordFunction(char[][] arr  ,String[] words, int vidx){
        
        if(vidx==words.length){
            print(arr);
            return 1;
        }
        String word = words[vidx];
       
        int count = 0 ;
        for(int r = 0 ; r<arr.length;r++){
            for(int c =0 ;c<arr[0].length;c++){
               
                if(arr[r][c]=='-' || arr[r][c]==word.charAt(0)){
                    
                    if(isPossibleToPlaceH(arr,word,r,c)){
                      
                        boolean[] charLoc = placeH(arr,word,r,c);
                        count+=crossWordFunction(arr,words,vidx+1);
                        unPlaceH(arr,word,r,c,charLoc);
                    }
                    if(isPossibleToPlacev(arr,word,r,c)){
                        boolean[] charLoc = placeV(arr,word,r,c);
                        count+=crossWordFunction(arr,words,vidx+1);
                        unPlaceV(arr,word,r,c,charLoc);
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        char[][] arr ={
        {'+','-','+','+','+','+','+','+','+','+'},
        {'+','-','+','+','+','+','+','+','+','+'},
        {'+','-','+','+','+','+','+','+','+','+'},
        {'+','-','-','-','-','-','+','+','+','+'},
        {'+','-','+','+','+','-','+','+','+','+'},
        {'+','-','+','+','+','-','+','+','+','+'}, 
        {'+','+','+','+','+','-','+','+','+','+'},
        {'+','+','-','-','-','-','-','-','+','+'},
        {'+','+','+','+','+','-','+','+','+','+'},
        {'+','+','+','+','+','-','+','+','+','+'}
    };
 
        String[] words = {"LONDON","DELHI","ICELAND","ANKARA"};
        int ans = crossWordFunction(arr,words,0);//
        System.out.println(ans);
    }
    
}










