import java.util.ArrayList;
import java.lang.StringBuilder;
public class formatWordsIntoSentence  {
    public static String[] filter(String[] input){
        ArrayList <String> list=new ArrayList<>();
        for(String s : input){
            if(!s.equals(""))
                list.add(s);
        }
        String[] completedList = list.toArray(new String[list.size()]);
        return completedList;
    }

    public static String solution(String[] input){
        String[] filteredInput = filter(input);
        StringBuilder output=new StringBuilder();
        for(int i=0;i<filteredInput.length;++i){
            output.append(filteredInput[i]);
            if(i+1==filteredInput.length-1){
                output.append(" and "+filteredInput[i+1]);
                break;
            }
            else
                output.append(", ");
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String[] input1={"ninja", "samurai", "ronin"};
        String[] input2={"ninja", "", "ronin"};
        String[] input3={""};
        System.out.println(solution(input1));
        System.out.println(solution(input2));
        System.out.println(solution(input3));
    }
}

