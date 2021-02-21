import java.util.Scanner;
public class stringSplit2 {

    static Scanner sc = new Scanner(System.in);
    public static String[] solution(String in){
        String[] arr=in.split("(?<=\\G.{2})");
        if(in.length()%2==0)
            return arr;
        else{
            arr[in.length()/2]+="_";
            return arr;
        }
    }
    public static void main(String[] args) {
        String input = sc.nextLine();
        String[] output =solution(input);
        for(String s:output)
            System.out.print(s+" ");
    }
}