public class phoneNumber {
    public static String phoneNumPH(){
        int[] numbers={0,1,2,3,4,5,6,7,8,9};
        String input="9";
        for(int i=1;i<numbers.length;++i){
            int ran=(int) (Math.random() * ((numbers[9] - numbers[0]) + 1)) + numbers[0];
            input+=String.valueOf(ran);
        }
        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "+63$1$2$3");
        return number;
    }
    public static String phoneNumUS(){
        int[] numbers={0,1,2,3,4,5,6,7,8,9};
        String input="9";
        for(int i=1;i<numbers.length;++i){
            int ran=(int) (Math.random() * ((numbers[9] - numbers[0]) + 1)) + numbers[0];
            input+=String.valueOf(ran);
        }
        String number = input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
        return number;
    }

    public static void main(String[] args){

        System.out.println(phoneNumPH());
        System.out.println(phoneNumUS());
    }

}
