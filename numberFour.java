import java.util.*;
public class numberFour {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("How many numbers will you enter: ");
        int ctr = sc.nextInt();

        System.out.println("Enter " + ctr + " integers one per line: ");
        do{
            int i = sc.nextInt();
            sum += i;
            --ctr;
        }while(ctr != 0);

        System.out.println("The sum is " + sum);
        sc.close();
    }
}
