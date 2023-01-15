public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Aleksandra Grabowska";
        student1.number = 999763;

        Student student2 = new Student();
        System.out.println(student1.name + " " + student1.number);
        System.out.println(student2.name + " " + student2.number);

        SecretStudent secretStudent1 = new SecretStudent();
        System.out.println(secretStudent1.getName());
        System.out.println(secretStudent1.getLastName());
        System.out.println(secretStudent1.getNumber());

        secretStudent1.setName("Jan");
        System.out.println(secretStudent1.getName());

        SecretStudent secretStudent2 = new SecretStudent();
        secretStudent2.readFromScanner();
        SecretStudent secretStudent3 = new SecretStudent();
        secretStudent3.readFromScanner();

        secretStudent2.print();
        secretStudent3.print();

        //jak zapisac zmienne osobno?

    }
}