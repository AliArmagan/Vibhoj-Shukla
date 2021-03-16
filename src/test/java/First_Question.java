import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class First_Question {


    public static void main(String[] args) {

        int[] Numbers ={1,2,3,4};
        int[] Matches ={1,2,5};

        System.out.println(solution(Numbers, Matches));


    }

    public static boolean solution(int[] Numbers, int[] Matches){
        List<Integer> nums = new ArrayList<Integer>();

        for(int each : Numbers){
            nums.add(each);
        }

        List<Integer> match = new ArrayList<Integer>();

        for(int each : Matches){
            match.add(each);
        }

        return nums.containsAll(match);

    }


}
