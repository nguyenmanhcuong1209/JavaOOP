import java.util.Scanner;

public class toantu {
    public static void main(String[] args) {
        double A, B, Tong, Hieu, Tich, Thuong, Phandu;
        Scanner sc = new Scanner(System.in);
        System.out.print ("So thu nhat =");
        A= sc.nextDouble();
        System.out.print ("So thu hai =");
        B= sc.nextDouble();
        double tong = A + B;
        System.out.println(A + " + " + B + " = " + tong);
         
        double hieu = A - B;
        System.out.println(A + " - " + B + " = " + hieu);
         
        double tich = A * B;
        System.out.println(A + " * " + B + " = " + tich);
         
        double thuong = (double) A / B;
        System.out.println(A + " / " + B + " = " + thuong);
         
        double du = A % B;
        System.out.println(A+ " % " + B + " = " + du);

        if (A==B)
      {System.out.print ("A=B");}
      else if (A>B)
        {System.out.print ("A>B");}
       else if (A<B) 
        {System.out.print ("A<B");}

    }
}