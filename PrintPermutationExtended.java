
import java.util.Scanner;
class PrintPermutationExtended {
public static Scanner scn = new Scanner(System.in);

public static int PrintPermutationExtendedFunction(String s , String asf){
if(s.length()==0){
System.out.println(asf);
return 1;
}
int count=0;
boolean[] arr = new boolean[26];
for(int i= 0 ;i < s.length() ; i++){
char ch = s.charAt(i);
if(!arr[ch-'a']){
arr[ch-'a']=true;
count+=PrintPermutationExtendedFunction(s.substring(0,i)+s.substring(i+1), asf+ch);
}

}

return count;
}
public static void main(String[] args){
String s = scn.nextLine();
int ans = PrintPermutationExtendedFunction(s,"");
System.out.println(ans);
}
}
