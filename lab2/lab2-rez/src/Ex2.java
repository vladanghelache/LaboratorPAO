import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a <= b && a <= c){
            System.out.print(a);
            System.out.print(" <= ");
            if(b <= c){
                System.out.print(b);
                System.out.print(" <= ");
                System.out.print(c);
            }
            else {
                System.out.print(c);
                System.out.print(" < ");
                System.out.print(b);
            }

        }
        else
        if(b <= a && b <= c){
            System.out.print(b);
            System.out.print(" <= ");
            if(a <= c){
                System.out.print(a);
                System.out.print(" <= ");
                System.out.print(c);
            }
            else {
                System.out.print(c);
                System.out.print(" < ");
                System.out.print(a);
            }

        }
        else
        {
            System.out.print(c);
            System.out.print(" <= ");
            if(b <= a){
                System.out.print(b);
                System.out.print(" <= ");
                System.out.print(a);
            }
            else {
                System.out.print(a);
                System.out.print(" < ");
                System.out.print(b);
            }

        }
    }
}
