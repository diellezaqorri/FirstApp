import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //// Krijo funksionin qe llogarit shumen e numrave nga nje numer n deri ne nje numer m. Rezultati te kthehet
        //// dhe te ruhet ne nje variabel. Ai rezultat le te zbritet me rezultatin e funksionit qe kthen shumezimin e
        //// numrit c dhe numrit d. Rezultati ne fund te printohet duke perdorur metoden void

        while (true) {
            Scanner skaneri = new Scanner(System.in);
            System.out.println("Pershendetje");
            System.out.println("Jepni numrin e pare per tu mbledhur");
            int n = skaneri.nextInt();
            System.out.println("Jepni numrin e dyte per tu mbledhur");
            int m = skaneri.nextInt();
            System.out.println("Jepni numrin e pare per tu shumzuar");
            int c = skaneri.nextInt();
            System.out.println("Jepni numrin e dyte per tu shumzuar");
            int d = skaneri.nextInt();

            int mbledhja = mbledhja(n, m);
            int prodhimi = prodhimi(c, d);
            rezultati2(mbledhja, prodhimi);
            System.out.println("Shtypni 1 per te vazhduar, numer tjeter per te anuluar ");
            int vazhdo = skaneri.nextInt();
            if(vazhdo != 1) {
                break;
            }
        }


    }

    static int mbledhja(int n, int m) {

        int rezultati = 0;

        while (n <= m)
            rezultati += n++;
        return rezultati;
    }

    static int prodhimi(int c, int d) {

        int rezultati = c * d;
        return rezultati;

    }

    static void rezultati2(int k, int g) {
        int rezultatiFinal = k - g;

        System.out.println("Rezultati = " + rezultatiFinal);

    }


}




