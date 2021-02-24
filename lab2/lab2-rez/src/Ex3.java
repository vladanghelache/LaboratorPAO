import java.util.Scanner;
import java.util.Vector;

public class Ex3 {
    public static boolean isPrime(int n){
        if(n<2 || (n>2 && n%2==0)){
            return false;
        }
        for (int i = 3; i*i <= n; i+=2) {
            if(n%i == 0){
                return false;
            }
        }
        return true;

    }
    public static void first50(){

        for (int i = 2; i < 50; i++) {
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {

        first50();

    }
}
