import java.util.Scanner;

public class pascalTriangle {
    static Scanner sc=new Scanner(System.in);

    static int fact(int num) {
        int factorial;

        for(factorial = 1; num > 1; num--){
            factorial *= num;
        }
        return factorial;
    }
    
    static int ncr(int n,int r) {
        return fact(n) / ( fact(n-r) * fact(r) );
    }

    public static void main(String[] args){
        System.out.print("Input Number: ");
        int input=sc.nextInt();
        for(int lines=0;lines<=input;++lines){
            for(int space=input;space>lines;--space)
                System.out.print(" ");

            for(int r=0,n=lines;r<=lines;++r)
                System.out.print(ncr(n,r)+" ");

            System.out.println("");
        }
    }
}
