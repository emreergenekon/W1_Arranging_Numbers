import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int  a, b, c;
        Scanner input =new Scanner(System.in);
//3 different number options.
        System.out.print("A Sayısı: ");
        a = input.nextInt();

        System.out.print("B Sayısı: ");
        b = input.nextInt();

        System.out.print("C Sayısı: ");
        c = input.nextInt();

        //numbers are arranged from the smallest to largest.
        if ((a > b) && (a > c)){
            if (b > c){
                System.out.println("c < b < a ");
            } else {
                System.out.println("b < c < a ");
            }
        } else if ((b > a) && (b > c)){
            if (a > c){
                System.out.println("c < a < b");
            } else {
                System.out.println("a < c < b");
            }
        } else {
            if (a > b){
                System.out.println("b < a < c");
            } else {
                System.out.println("a < b < c");
            }
        }
    }
}