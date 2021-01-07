
import java.util.Scanner;
public class PrintMazePath {
    public static void PrintMazePathFunction(int sr,int sc , int dr,int dc,String asf){
        if(sr==dr && sc == dc){
            System.out.println(asf);
            return;
        }

        if(sc<=dc)PrintMazePathFunction(sr, sc+1, dr, dc, asf+"H");
        if(sr<=dr)PrintMazePathFunction(sr+1, sc, dr, dc, asf+"V");
        if(sc<=dc && sr<=dr)PrintMazePathFunction(sr+1, sc+1, dr, dc, asf+"D");
    }

    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        PrintMazePathFunction(0,0,n-1,m-1,"");

    }
}