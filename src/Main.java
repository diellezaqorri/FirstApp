import javax.swing.*;
import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Main {

    private static Object StringBuffer;

    public static void main(String[] args) {
        double[] Q = {0.0, 0.0};
        double[] P = {6.0, 3.0};
        System.out.println(circleContains(Q,P, 5));

//
//        String fjala = "dielLeza";
//
//        char character = 'l';

        //System.out.println(countChat(fjala, character));
        String fjala1="qorri";
        String fjala2="diellezorri";
       // System.out.println(contains(fjala1,fjala2));


    }
    //Kemi nje string -gjeje sa her perseritet nje shkronje e caktuar renda  atij stringu-
    //me kthy nje int-nr ;kerkimi dueht te jete case sensitive dmth ska lidhje a eshte shkronj
    // e madhe apo e vogel -dy parametra djala dhe shkronja-te kthehet nr i perseritjes

    static int countChat(String fjala, char character) {
        String fjalalow = fjala.toUpperCase();
        char ch1 = Character.toUpperCase(character);

        char[] fjalarray = fjalalow.toCharArray();
        int count = 0;
        for (int i = 0; i < fjala.length(); i++)
            if (ch1 == fjalarray[i])
                count++;
        return count;


    }
    //    String fjala = "otto";
//    StringBuilder sBuilder = new StringBuilder(fjala);
//    String fjalaReversed = sBuilder.reverse().toString();
//
//    if(fjalaReversed.equals(fjala)) {
//        System.out.println(fjala);
//    } else {
//        System.out.println(fjalaReversed);
//    }

    static boolean isAnagram(String fjala) {
        char[] vargu1 = fjala.toCharArray();
        char[] reversedvargu = new char[fjala.length()];
        for (int i = 0; i < fjala.length(); i++) {
            reversedvargu[i] = vargu1[fjala.length() - i - 1];
            if (reversedvargu[i] != vargu1[i])
                return false;
        }
        return true;

    }

    //Shkruaje nje metode qe ma kthen true ose false nese fjala1 gjendet ne fjalen 2 ;
    //static boolean contains (string fjala 1, string fjala 2 );
    static boolean contains(String fjala1, String fjala2) {
        if (fjala2.contains(fjala1))
            return true;
        else
            return false;



    }
    //shkruaje metoden qe per nje rreth me origjine Q(p,q) dhe radius r te llogaritet se
    //nje pike e dhenne P (s,t) a gjindet brenda ,jasht apo ne rreth
    //per rastin brenda apo ne rreth le te kthej true,else false
    static boolean circleContains(double[] Q, double [] P, double r){
        //radiusi r i dhene
        //Q origjina e dhene

        double q=P[0]-Q[0];
        double p =P[1]-Q[1];
        double x=Math.pow(q,2)+ Math.pow(p,2);
        double d =sqrt(x);
        if( Math.pow(d,2)<=Math.pow(r,2))
           return true;
        else
           return  false;

      //  double distanca = sqrt(Math.pow((P[0] - Q[0]), 2) - Math.pow((P[1] - Q[1]), 2));

    //   return Math.pow(distanca, 2) <= Math.pow(r, 2);





    }





}







