import java.util.Scanner;

public class SecretStudent {
    private static String name = "default secret first name";
    private static String lastName = "default secret last name";
    private static int number = 1000;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        if (newName.equals(" ") || newName.equals("")){
            return;
        }
        name = newName;

    }
    public String getLastName(){
        return lastName;
    }

    public int getNumber(){
        return number;
    }

    public void readFromScanner(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first name");
        name = scan.nextLine();
        System.out.println("Input last name");
        lastName = scan.nextLine();
        System.out.println("Input student number");
        number = scan.nextInt();

    }

    public static void print(){
        System.out.println(SecretStudent.name + " " + SecretStudent.lastName + " " + SecretStudent.number);
    }

}
