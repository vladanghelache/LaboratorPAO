import java.util.Scanner;

public class Ex5 {
    public static long putere(long baza, int exp) {
        long rez = 1;
        while (exp>0) {
            if(exp%2==0) {
                baza *= baza;
                exp/=2;
            }
            else{
                rez *= baza;
                exp--;
            }
        }
        return rez;
    }
    public static  void afisare(long baza, int exp) {
        System.out.println(baza + " ^ " + exp + " = " + putere(baza, exp));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Baza: ");
        int b = scan.nextInt();
        System.out.print("Exponentul: ");
        int exp = scan.nextInt();

        afisare(b,exp);

    }
}
