import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x =2;
        int y=3;
        System.out.println(x * y);

        String casa= "case";
        int num= 3;
        System.out.println("marco ha " + num +" "+ casa);
 //String[] animali ={ "cane", "gatto", "lupo", "coniglio", "uccello"};
 //animali[3]="gufo";
       // System.out.println(animali);

        Scanner scanner= new Scanner(System.in);
        System.out.println("inserisci la prima parola");
        String parola1= scanner.nextLine();
        System.out.println("inserisci la seconda parola");
        String parola2= scanner.nextLine();
        System.out.println("inserisci la terza parola");
        String parola3= scanner.nextLine();
        System.out.println( parola1 + parola2 + parola3);
    }
}