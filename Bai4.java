import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap 1 so nguyen :");
        int so = sc.nextInt();
        
        
        switch (so) {
            case 1:
                System.out.print("thang 1");
                break;
            case 2:
                System.out.print("thang 2");
                break;
            case 3:
                System.out.print("thang ");
                break;
                case 4:
                System.out.print("thang 4");
                break;
                case 5:
                System.out.print("thang 5");
                break;
                case 6:
                System.out.print("thang 6");
                break;
                case 7:
                System.out.print("thang 7");
                break;
                case 8:
                System.out.print("thang 8");
                break;
                case 9:
                System.out.print("thang 9");
                break;
                case 10:
                System.out.print("thang 10");
                break;
                case 11:
                System.out.print("thang 11");
                break;
                case 12:
                System.out.print("thang 12");
                break;
                default:
                System.out.println("So thang sai");
                sc.close();
        }
    }
}
