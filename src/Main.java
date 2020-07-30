import java.util.Scanner;

public class Main {

    private static Object StringBuffer;

    public static void main(String[] args) {

//interned way or string literals
        //stored in the string pool
        //str and str2 are reference variables pointing to the same literal
        String str = "Hello";
        String str2 = "Hello";
        //we are not comparing content"hallo"
        //we are comparing hash codes of str and str2 which will be the same for the string "Hallo"
        if (str == str2)
            System.out.println("str==str2");
        else
            System.out.println("str!=str2");
        //String object i.e we used a new operator
        //string object is constructed in the heap area with hello as its contents

        String str3 = new String("Hallo");
        String str4 = new String("Hallo");
        //str3 and str4 are reference variables which are pointing to two different objects
        //whose content its the same


        //we are not comparing content"hallo"
        //we are comparing hash codes of str and str2 which will be different for the string
        //object containing "Hallo"

        if (str3 == str4)
            System.out.println("str3==str4");
        else
            System.out.println("str3!=str4");
        //CONCLUSION : == will compare reference variables and not the content which is "Hallo"

        //How should we compare strings: the content within, we do not use==
        if (str3.equals(str4))
            System.out.println("str3 is equal to str4");
        else
            System.out.println("str3 is not equal to str4");

        if (str3.compareTo(str4) == 0)
            System.out.println("str3 compared to str4");
        else
            System.out.println("str3 not compared to str4");

        //String methods
        String str1 = "John, Jennie, Jim, Jack, Joe";
        int lenght = str1.length();
        System.out.println("Length of str1 is:" + lenght);
        System.out.println(str1.charAt(0) + "|" + str1.charAt(lenght - 1));


//strings are immutable, no changes string remains the same
        str1.toUpperCase();
        System.out.println("str1 after Uppercase:" + str1);

//we create a new string that will be manipualted
        String s1 = str1.toUpperCase();
        System.out.println(s1);

        //
        if (str1.contains("Jim"))
            System.out.println("Jim is in the string");
        //"John, Jennie, Jim, Jack, Joe"//case s2: 0J 1o 2h 3n 4, 5whitespace
        //s3 0J 1o 2h 3n 4, 5whitespace 6J 7e 8n 9Nn 10i   //6-included 10-not included
        //starts with 6th index till 9th index
        String s2 = str1.substring(5);
        System.out.println("s2 is:" + s2);
        String s3 = str1.substring(6, 10);
        System.out.println(("s3 is:" + s3));
        //crating new string with replaced characters
        String s4 = str1.replace('J', 'K');
        System.out.println("s4:" + s4);
        // from string to array
        char[] chArray = str1.toCharArray();
        for (char ch : chArray)
            System.out.print(ch + " ");

        // to split  a string with , --removes , and splits the string
        String[] strArr = str1.split(",");
        for (String s : strArr)
            System.out.println(s);


        //Data during registration
        String email = "dieellza.q@hotmail.com";
        String phone = "04450050";
        String pass = "password123";
        //validate data from user
        if (!email.isEmpty()) {
            System.out.println("Email is available");
            if (!email.contains(".") || !email.contains("@"))
                System.out.println("but email is not a valid email");
            else
                System.out.println("Email is valid");
        } else
            System.out.println("Please write an email");

        if (phone.isEmpty())
            System.out.println(("Please provide a phonenumber"));
        if (phone.length() != 9)
            System.out.println("Phone number is invalid");
        else
            System.out.println("Phone number is provided");


        /// strings are immutable
        String string = new String ("Hallo");
        string.concat("World");// strings are immutable,the string will still =HAllo
        System.out.println(string);



        ///// STRING BUFFER allows manipulation/after we append world it becomes a new word
       // HalloWorld// stringbuffer is mutable sequences of the string//threadsafe
        StringBuffer buffer= new StringBuffer("Hallo");
        buffer.append("World");
        System.out.println(buffer);

        ///// STRING builder allows manipulation/after we append world it becomes a new word
        // HalloWorld// stringbuilder is not thread safe
        StringBuilder builder= new StringBuilder("Hallo");
        builder.append("World");
        System.out.println(builder);





    }
    }







