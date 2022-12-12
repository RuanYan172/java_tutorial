import person.Person;
import person.PersonsManager;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       personPrograming();
    }

    public static void personPrograming(){
        System.out.println("Nhap so nguoi");
        var member = sc.nextInt();
        var persons = new Person[member];
        var personsManager = new PersonsManager(persons);
        personsManager.initPersonsDateFromKeyBoard();
        personsManager.printPersons();
    }
}