import java.util.Scanner;

public class Chanle {
    public static void main(String[] args) {
       double A;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Nhap so bat ky=");
        A= sc.nextDouble();
        if (A%2 ==0)
        {  System.out.print ("Day la so chan");}
        else
        {  System.out.print ("Day la so le");}
    }
}
