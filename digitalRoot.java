import java.util.*;
public class digitalRoot {
    static Scanner sc=new Scanner (System.in);
    public static int solution(int num){
        int digit,answer=0;
        while(true){
            while(num!=0){
                digit=num%10;
                num/=10;
                answer+=digit;
            }
            if(answer>9){
                num=answer;
                answer=0;
                continue;
            }
            else
                break;
        }
        return answer;
    }
    public static void main(String[] args){
        int num=sc.nextInt();
        System.out.println(solution(num));
    }
}
