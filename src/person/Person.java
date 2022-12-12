package person;

public class Person {
    private int ID;
    private String name;
    private boolean gender;

    public Person() {

    }

    public Person(int iD, String name, boolean gender) {
        ID = iD;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Ma id: " + ID + "\n Ten la: " + name + "\n Gioi tinh la: " + genderToString();
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String genderToString() {
        return gender == true ? "Nam" : "Nu";
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}

