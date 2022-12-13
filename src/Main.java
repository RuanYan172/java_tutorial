import person.Person;
import person.PersonsManager;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        personPrograming();

    }

    public static void personPrograming() {
        System.out.println("Nhap so nguoi");
        var member = sc.nextInt();
        var persons = new Person[member];
        var personsManager = new PersonsManager(persons);
        personsManager.initPersonsDateFromKeyBoard();
        personsManager.printPersons();
        runProgram: while (true) {
            System.out.println("1. \t\tThem nguoi .");
            System.out.println("2. \t\tXoa nguoi .");

            System.out.println("10. \t\tDung chuong trinh.");

            var inputOption = sc.nextInt();

            switch (inputOption) {
                case 1 -> {
                    personsManager.addPersonFromKeyBoard();
                }
                case 2 -> {
                    System.out.println("Nhap vao id Ban muon xoa:");
                    var id = sc.nextInt();
                    personsManager.deletePersonById(id);
                }
                case 10 -> {
                    break runProgram;
                }
            }
            personsManager.printPersons();
        }
        System.out.println("Chuong trinh da tat");
    }
}