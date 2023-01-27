import java.util.Scanner;

public class SecretStudent {
    private static String name = "default secret first name";
    private static String lastName = "default secret last name";
    private static int number = 1000;

    public String getName(){
        return name;
    }
    public String setName(String newName){
        if (newName.equals(" ") || newName.equals("")){
            return newName;
        }
        name = newName;

        return newName;
    }
    public String getLastName(){
        return lastName;
    }
    public String setLastName(String newLastName){lastName = newLastName;
        return newLastName;
    }

    public int getNumber(){
        return number;
    }
    public int setNumber(int newNumber){number = newNumber;
        return newNumber;
    }


    public SecretStudent readFromScanner(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first name");
        this.name = setName(scan.nextLine());
        System.out.println("Input last name");
        this.lastName = setLastName(scan.nextLine());
        System.out.println("Input student number");
        this.number = setNumber(scan.nextInt());
        return new SecretStudent();

    }

    public static void print(){
        System.out.println(SecretStudent.name + " " + SecretStudent.lastName + " " + SecretStudent.number);
    }

}
