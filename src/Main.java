import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static Object StringBuffer;

    public static void main(String[] args) {

//    String fjala = "otto";
//    StringBuilder sBuilder = new StringBuilder(fjala);
//    String fjalaReversed = sBuilder.reverse().toString();
//
//    if(fjalaReversed.equals(fjala)) {
//        System.out.println(fjala);
//    } else {
//        System.out.println(fjalaReversed);
//    }



    }
    static boolean isAnagram(String fjala){
        char[] vargu1 = fjala.toCharArray();
        char[] reversedvargu = new char[fjala.length()];
        for (int i = 0; i < fjala.length(); i++) {
            reversedvargu[i] = vargu1[fjala.length() - i - 1];
            if (reversedvargu[i] != vargu1[i])
                return false;
        }
        return true;

    }
}







