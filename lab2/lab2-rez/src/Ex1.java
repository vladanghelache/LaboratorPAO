import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            if(i%10!=0 && i%5==0){
                System.out.print(i);
                System.out.print(' ');
            }

        }
    }
}
