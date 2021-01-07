import java.util.Scanner;
public class PrintMazePathWithMultipleJump {

    public static Scanner scn = new Scanner(System.in);
    public static int PrintMazePathWithMultipleJumpFunction(int sr,int sc ,int dr ,int dc,String psf){
        if(sc==dc-1 && sr==dr-1){
            System.out.println(psf);
            return 1;
        }
        int count=0;
        for(int j =1;sc+j<dc ; j++)count+=PrintMazePathWithMultipleJumpFunction(sr, sc+j, dr, dc, psf+"H"+j);
        for(int j =1;sr+j<dr ; j++)count+=PrintMazePathWithMultipleJumpFunction(sr+j, sc, dr, dc, psf+"V"+j);
        for(int j =1;sr+j<dr && sc+j<dc ; j++)count+=PrintMazePathWithMultipleJumpFunction(sr+j, sc+j, dr, dc, psf+"D"+j);
        return count;
    }
    public static void main(String[] args){
        int row = scn.nextInt();
        int col = scn.nextInt();

        int count=PrintMazePathWithMultipleJumpFunction(0,0,row,col,"");
        System.out.println(count);
    }
    
}