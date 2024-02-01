import java.util.Scanner;

/**
 * Baislide55
 */
public class Baislide55 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("cac so chia het cho 5 la: ");
  for (int i = 0; i <= 20; i++) {
     if (i % 5 != 0) {
            continue;
        }
  System.out.println(i);
    }
    sc.close();
}

}