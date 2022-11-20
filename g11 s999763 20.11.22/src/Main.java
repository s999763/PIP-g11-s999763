import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //=========ZADANIE 1========

        boolean czyPada = false;
        boolean czySwieciSlonce = false;

        if (czyPada == true && czySwieciSlonce == false) {
            System.out.println("Plucha");
        }
        else if (czyPada == true && czySwieciSlonce == true) {
            System.out.println("Tęcza");
        }
        else if (czyPada == false && czySwieciSlonce == true) {
            System.out.println("Słonecznie");
        }
        else if (czyPada == false && czySwieciSlonce == false) {
            System.out.println("Pochmurno");
        }
        //======KONIEC ZADANIA 1======

        // ======= ZADANIE 4 =======
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int pierwszaLiczba = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj drugą liczbę");
        int drugaLiczba = Integer.parseInt(scan.nextLine());
        System.out.println("Podaj typ działania:");
        String dzialanie = scan.nextLine();

        switch(dzialanie) {
            case "ADD":
                System.out.println("Wynik: " + (pierwszaLiczba + drugaLiczba));
                break;
            case  "SUB":
                System.out.println("Wynik: " + (pierwszaLiczba - drugaLiczba));
                break;
            case "DIV":
                System.out.println("Wynik: " + (pierwszaLiczba / drugaLiczba));
                break;
            case "MUL":
                System.out.println("Wynik: " + (pierwszaLiczba * drugaLiczba));
                break;
            default:
                System.out.println("Brak takiej operacji");
                            }

        //======KONIEC ZADANIA 4========

        //======ZADANIE 5=======
        

        //======KONIEC ZADANIA 5========
    }

    //public static int absoluteValue(()){
            //if
        }
}
