import java.util.Scanner;
import java.util.StringTokenizer;
public class stringTokenizer{
    static Scanner input= new Scanner (System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer result = new StringTokenizer(s,"!,?._' @");
        System.out.println(result.countTokens());
        while(result.hasMoreTokens()){
            System.out.println(result.nextToken());
        }
        scan.close();
    }
}