import java.util.*;
public class josephusSurvivor {
    static Scanner sc=new Scanner(System.in);

    public static int competition(int[] participants){
        for(;participants.length!=1;) {
            
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println("Enter 2 numbers:");
        int[] num=new int[2];
        num[0]=sc.nextInt();//total number of participants
        num[1]=sc.nextInt();//amount of steps per round
        int[] participants=new int[num[0]];
        for(int i=0;i<num[0];++i){
            participants[i]=i+1;
        }
        System.out.println(competition(participants));


        }

    }
