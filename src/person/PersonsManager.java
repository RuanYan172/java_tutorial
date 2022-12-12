package person;

import java.util.Scanner;

public class PersonsManager {
    private Person[] persons;
    Scanner sc = new Scanner(System.in);

    public PersonsManager(Person[] persons) {
        this.persons = persons;
    }

    public Person getPersonFromKeyBoard() {
        System.out.println("Nhap ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten nguoi: ");
        String name = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        boolean gender = sc.nextInt() == 1;
        return new Person(id, name, gender);
    }

    public void initPersonsDateFromKeyBoard() {
        for (int i = 0; i < persons.length; i++) {
            this.persons[i] = getPersonFromKeyBoard();
        }
    }

    public void printPersons() {
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }

    public Person findPersonById(int id) {
        for (Person person : persons) {
            if (person.getID() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean isPersonExist(Person person) {
        return findPersonById(person.getID()) != null;
    }
public void addPerson(int id){
        
}
}

