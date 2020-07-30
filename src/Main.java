import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Jepni numrin tuaj:");
        int a = input.nextInt();

        System.out.println("Numri juaj eshte:" + a);
        System.out.println("Numri i kundert me inputin tuaj eshte:" + numriKundert(a));


    }

    static int numriKundert(int n) {
        int numritjeter = 0;
        if (n != 0)
            numritjeter = n * (-1);


        return numritjeter;
    }

}

//krijo nje metode qe merr si parameter numrin dhe kthen numrin e kundert ,nese jep zero te kthen zero.r
//rezutlati te kthehet

// Krijo funksionin qe llogarit shumen e numrave nga nje numer n deri ne nje numer m. Rezultati te kthehet
// dhe te ruhet ne nje variabel. Ai rezultat le te zbritet me rezultatin e funksionit qe kthen shumezimin e
// numrit c dhe numrit d. Rezultati ne fund te printohet duke perdorur metoden void

// metoda 1: int shumaNumrave(int m, int n)
// metoda 2: int prodhimiNumrave(int c, int d)
// metoda 3: void printoRezultatin(int shuma, int prodhimi)

// si duket ne fund: "shuma - prodhimi =" + rezultati




