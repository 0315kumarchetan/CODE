import java.util.Scanner;
public class PrintMazePath {
public static Scanner scn =new Scanner(System.in); 
public static int PrintMazePathFunction(int sr , int sc , int dr , int dc , String psf){
    if(sc==dc && sr ==dr){
        System.out.println(psf);
        return 1;
    }
    int count=0;
    if(sc+1<=dc)count+=PrintMazePathFunction(sr, sc+1, dr, dc, psf+'H');
    if(sr+1<=dr)count+=PrintMazePathFunction(sr+1, sc, dr, dc, psf+'V');
    if(sr+1<=dr && sc+1<=dc)count+=PrintMazePathFunction(sr+1, sc+1, dr, dc, psf+'D');
    return count;
}
public static void main(String[] args){
    System.out.println(PrintMazePathFunction(0,0,scn.nextInt()-1,scn.nextInt()-1,""));
}   
}