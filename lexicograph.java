import java.util.Scanner;

public class lexicograph {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        String s=input.nextLine();
        int k=input.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }
    public static String getSmallestAndLargest(String s, int k) {

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String smallest=s.substring(0,k);
        String largest=s.substring(0,k);
        for(int i=1;i<s.length()-(k-1);++i){//smallest
            String sub="";
            sub=s.substring(i,i+k);
            if (sub.compareTo(smallest)<0)
                smallest=sub;
            else
                continue;
        }
        for(int i=1;i<s.length()-(k-1);++i){//smallest
            String sub="";
            sub=s.substring(i,i+k);
            if (sub.compareTo(largest)>0)
                largest=sub;
            else
                continue;
        }


        return smallest + "\n" + largest;
    }
}
