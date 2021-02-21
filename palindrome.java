import java.util.*;
import java.lang.StringBuilder;
public class palindrome {
    static Scanner sc=new Scanner(System.in);
    public static int longestPalidrome(String word){
        boolean palindrome=false;
        int ctr=0;
        if (word.length()==0)
            return 0;
        for(int i=0;i<word.length();++i){
            for(int j=i+3;j<=word.length();++j){
                String holder=word.substring(i,j);
                StringBuilder rev= new StringBuilder();
                (rev.append(holder)).reverse();
                String compare=rev.toString();
                if(compare.equalsIgnoreCase(holder)&&compare.length()>ctr) {
                    ctr = compare.length();
                    palindrome=true;
                }
            }

        }
        if(palindrome==false)
            return 1;
        return ctr;
    }
    public static void main(String[] args){
        String word=sc.nextLine();
        System.out.println(longestPalidrome(word));
    }
}

