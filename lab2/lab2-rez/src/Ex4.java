import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        int nr = 0;
        double s = 0;
        while(n != -1){
            s+= n;
            nr++;
            n = scan.nextDouble();
        }
        System.out.print(s/nr);
    }
}
