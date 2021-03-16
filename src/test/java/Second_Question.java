import javax.sound.sampled.SourceDataLine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Second_Question {
    public static void main(String[] args) {


        System.out.println(unique("wwaatteerr"));
        System.out.println(frequency1("asssddcl"));


    }

    public static String unique(String str) {

        String[] arr=str.split("");

        String result="";

        for(int j=0; j<arr.length; j++) {

            int frequency=0;

            for(int i=0; i<arr.length; i++ ) {

                if(arr[i].equals(arr[j]) )

                    frequency++;

            }

            if(frequency==1)

                return arr[j];

        }

        return result;

    }

    public static String frequency1(String str){

        List<String> list = new ArrayList<String>(Arrays.asList(str.split("")));
        String result = "";

        for(String eachChar : list){
            int frequency = Collections.frequency(list, eachChar);
            if(frequency==1) return eachChar;
        }

        return result;
    }



}
