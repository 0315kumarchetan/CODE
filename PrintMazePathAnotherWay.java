import java.util.Scanner;
public class PrintMazePathAnotherWay {
    public static Scanner scn = new Scanner(System.in);
    public static int PrintMazePathAnotherWayFunction(int sr,int sc , int dr , int dc , int[][] dir , String[] dirS,String psf){
        if(sc==dc && dr==sr){
            System.out.println(psf);
            return 1;
        }
        int count=0;
        for(int d = 1 ; d<Math.max(dc,dr);d++){
            int r = sr+dir[d][0];
            int c = sc+dir[d][1];
            if(r<dr)count+=PrintMazePathAnotherWayFunction(r, c, dr, dc, dir, dirS, psf+dirS[d]);
            if(c<dc)count+=PrintMazePathAnotherWayFunction(r, c, dr, dc, dir, dirS, psf+dirS[d]);
        }
        return count;
    }
    public static void main(String[] args){
        int[][] dir ={{0,0},{0,1},{1,0},{1,1}};
        String[] dirS= {"","H","V","D"};
        PrintMazePathAnotherWayFunction(0,0,scn.nextInt()-1,scn.nextInt()-1,dir ,dirS,"");

    }

    
}