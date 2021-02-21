import java.util.Scanner;
public class javacalcu {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int selection, n;
        String again;
        do{
            do {
                System.out.println("1)Addition \n2)Subtraction \n3)Multiplication \n4)Division");
                System.out.print("Enter selection: ");
                selection = input.nextInt();
            } while (selection < 1 || selection > 4);

            System.out.print("How many would you like input: ");
            n = input.nextInt();
            double[] num = new double[n];
            int x=0;
            for (double i : num) {
                num[x] = input.nextDouble();
                ++x;
            }

            if(selection==1){//addition
                System.out.println("The sum is: " + addThem(num));
            }
            else if(selection==2){
                System.out.println("The difference is: " + subThem(num));
            }
            else if(selection==3){
                System.out.println("The product is: " + mulThem(num));
            }
            else{
                System.out.println("The quotient is: " + divThem(num));
            }
            System.out.print("Would you like to try again? ");
            again=input.next();
        }while(again.equalsIgnoreCase("y"));
        System.out.println("Terminated");
    }
    public static double addThem(double num[]){
        double answer = 0;
        for(double i:num)
            answer+=i;
        return answer;
    }
    public static double subThem(double num[]){
        double answer=num[0];
        for(int i=1;i<num.length;++i)
            answer-=num[i];
        return answer;
    }
    public static double mulThem(double num[]){
        double answer=1;
        for(double i:num)
            answer*=i;
        return answer;
    }
    public static double divThem(double num[]){
        double answer=num[0];
        for(int i=1;i<num.length;++i)
            answer/=num[i];
        return answer;
    }
}
