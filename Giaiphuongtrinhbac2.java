import java.util.Scanner;

/**
 * Giaiphuongtrinhbac2
 */
public class Giaiphuongtrinhbac2 {

    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.print ("A=");
        a= sc.nextDouble();
        System.out.print ("B=");
        b= sc.nextDouble();
        System.out.print ("C=");
        c= sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
            if (c == 0) {
                System.out.println("phuong trinh vo nghiem!");
            } else {
                System.out.println("phuong trinh vo nghiem!");
            }
            } else {
            System.out.println("phuong trinh co nghiem la: " + (-c / b));
            }
}
               delta = Math.pow(b, 2) - 4*a*c;
        if (delta <0){
            System.out.println("Phuong trinh vo nghiem");
        }
        else if (delta ==0){
            x1 = -b / (2 * a);
            System.out.println("phuong trinh co 1 nghiem la x1 = x2 = " + x1);
        }
        else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("phương trinh co 2 nghiem x1 = " + x1 + " và x2 = " + x2);
        }

    }
}