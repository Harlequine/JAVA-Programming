import java.util.*;

public class array1 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);


        System.out.println("Enter an integer from 1 to 20: ");
        int loop[] = new int[20];

        for(int i = 0; i < 20; ++i){
            loop[i] = sc.nextInt();
        }

        System.out.print("\nList of array elements: ");
        for(int i = 0; i < 20; ++i){
            System.out.print(loop[i] + " ");
        }

        System.out.print("\nList of array elements in reversed order: ");
        for(int i = 19; i > -1; --i){
            System.out.print(loop[i] + " ");
        }

        System.out.print("\nList of array elements of even numbers: ");
        for(int i = 0; i < 20; ++i){
            if(loop[i] % 2 == 0){
                System.out.print(loop[i] + " ");
            }
        }

        System.out.print("\nList of array elements odd numbers: ");
        for(int i = 0; i < 20; ++i){
            if(loop[i] % 2 != 0){
                System.out.print(loop[i] + " ");
            }
        }
    }
}
