import java.util.*;
public class numberThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter Start: ");
        int start = sc.nextInt();

        System.out.print("Enter End: ");
        int end = sc.nextInt();

        System.out.println();
        do{
            System.out.println(start);
            sum += start;
            ++start;
        }while(start <= end);
        System.out.println("Sum of in range values: " + sum);
        sc.close();
    }
}
