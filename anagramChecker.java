import java.util.Scanner;
public class anagramChecker {

    public static boolean isAnagram(String c, String d){
        boolean ans;
        String a= c.toLowerCase();
        String b= d.toLowerCase();
        if(a.length()!=b.length())
            return false;
        else{
            for(int i=0;i<a.length();++i){
                ans=false;
                for(int j=0;j<b.length();++j){
                    if(a.charAt(i)==b.charAt(j)){
                        ans=true;
                        String holder=b.substring(0,j) + b.substring(j+1);
                        b=holder;
                        break;
                    }
                }
                if(ans==false)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}