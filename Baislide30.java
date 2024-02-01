import java.util.Scanner;

/**
 * Baislide30
 */
public class Baislide30 {
public static void main(String[] args) {
     int n, soDu, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n bat ki= ");
        
        n = sc.nextInt();
        while (n > 0) {
            soDu = n % 10;
            n = n / 10;
            tong += soDu;
        }
        System.out.print("Tong cac chu so la= " + tong);
        sc.close();
}
    
}