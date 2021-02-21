import java.util.*;
import java.lang.StringBuilder;
public class countingBit {
    static Scanner sc=new Scanner(System.in);
    public static int binaryCount(int num){
        StringBuilder bit = new StringBuilder();
        int ctr=0;
        for(;num!=0;){//decimal to binary...
            int remainder=num%2;
            bit.append(remainder);
            num/=2;
        }
        bit.reverse();
        for(int i=0;i<bit.length();++i)//add all instance of "1"
            if(bit.charAt(i)=='1')
                ctr++;

        return ctr;
    }
    public static void main(String[] args){
        int num=sc.nextInt();
        System.out.println(binaryCount(num));
    }
}