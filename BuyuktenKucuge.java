import java.util.Scanner;

public class BuyuktenKucuge {
    public static void main(String[] args) {

        int x,y,z;
        Scanner scan = new Scanner(System.in);

        System.out.print("1. say�y� giriniz: ");
        x= scan.nextInt();

        System.out.print("2. say�y� giriniz: ");
        y= scan.nextInt();

        System.out.print("3. say�y� giriniz: ");
        z= scan.nextInt();

        System.out.print("S�ralama �u �ekildedir: ");

        if (x<y && y<z) {
            System.out.print("x<y<z");
        }if (x<z && z<y) {
            System.out.print("x<z<y");
        }if (y<x && x<z) {
            System.out.print("y<x<z");
        }if (y<z && z<x) {
            System.out.print("y<z<x");
        }if (z<x && x<y) {
            System.out.print("z<x<y");
        }if (z<y && z<x) {
            System.out.print("z<y<x");
        }
    }
}
