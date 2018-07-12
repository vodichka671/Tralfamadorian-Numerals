import java.util.Scanner;


public class Menu {
    public static void showMenu(){
        System.out.println("Input your Tralfamadorian number using \u03b1, \u03b2, \u03b3, \u03b4, \u03b5, \u03b6, \u03b7, \u03b8, \u03b9");
        System.out.println("For instance you can choose \u03b1+xx\u03b5++, \u03b2+x\u03b1+\u03b8|, \u03b9+x, \u03b3++\u03b4+\u03b2" );
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        TralfNum A = new TralfNum(input);
        System.out.println("Your number in decimal : " + A.getDecimal());

    }
}
