public class bitwiseOperators {
    public static void main (String[] args){
        int num1=11,num2=22,result=0;

        result= num1|num2;
        System.out.println(result);

        result= num1^num2;
        System.out.println(result);

        result=num1>>>2;
        System.out.println(num1);

        result= num1<<num2;
        System.out.println(result);

        result= num1>>>num2;
        System.out.println(result);
    }
}
