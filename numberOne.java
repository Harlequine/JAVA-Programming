public class numberOne {
    public static void main(String[] args){
        System.out.print("a. ");
        for (int i = 19; i > 0; i-=2){
            System.out.print(i + " ");
        }

        System.out.print("\nb. ");
        for (int i = 1; i <= 5; ++i){
            System.out.print(i + " " + i*5 + " ");
        }

        System.out.println("\nc. Number\tSquare\tCube");
        for (int i = 1; i <= 10; ++i){
            System.out.println("\t"+ i + "\t\t" + i*i + "\t\t"+i*i*i);
        }
    }
}
