import java.util.*;
public class ticTacToe {
    static char[] display={'1','2','3','4','5','6','7','8','9'};
    static Scanner in=new Scanner(System.in);
    public static void board(char[] display){
        System.out.println(display[0]+" | "+display[1]+" | "+display[2]);
        System.out.println("_ + _ + _");
        System.out.println(display[3]+" | "+display[4]+" | "+display[5]);
        System.out.println("_ + _ + _");
        System.out.println(display[6]+" | "+display[7]+" | "+display[8]);
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static boolean turn(int i){
        if(i%2==1)
            return true;
        else
            return false;
    }
    public static boolean checkWin(){
        if(display[0]==display[1]&&display[1]==display[2])
            return true;
        else if(display[3]==display[4]&&display[4]==display[5])
            return true;
        else if(display[6]==display[7]&&display[7]==display[8])
            return true;
        else if(display[0]==display[3]&&display[3]==display[6])
            return true;
        else if(display[1]==display[4]&&display[4]==display[7])
            return true;
        else if(display[2]==display[5]&&display[5]==display[8])
            return true;
        else if(display[0]==display[4]&&display[4]==display[8])
            return true;
        else if(display[2]==display[4]&&display[4]==display[6])
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int x=1;
        while(x<=9){
            board(display);
            String player=turn(x)? "Player1: " : "Player2: ";
            System.out.print(player);
            int gridSelect=in.nextInt();
            display[gridSelect-1]=turn(x)? 'X' : 'O';
            clearScreen();
            board(display);
            if(checkWin()) {
                System.out.println("Winner! "+player);
                break;
            }
            ++x;
        }
    }
}
