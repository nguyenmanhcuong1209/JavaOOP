import java.util.Scanner;

/**
 * Giaiphuongtrinhbac1
 */
public class Giaiphuongtrinhbac1 {

    public static void main(String[] args) {
        double A, B, nghiem;
        Scanner sc = new Scanner(System.in);
        System.out.print ("A=");
        A= sc.nextDouble();
        System.out.print ("B=");
        B= sc.nextDouble();
        if (A == 0) {
            System.out.println("khong co nghiem");
        } else {
            nghiem = -B/A;
            System.out.println("Phuong trinh co nghiem = " + (nghiem) + ".");
        }
    }
}