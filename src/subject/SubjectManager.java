package subject;

import java.util.Scanner;

public class SubjectManager {
    private Subject[] subjects;
    private static Scanner sc = new Scanner(System.in);

    public SubjectManager(Subject[] subjects) {
        this.subjects = subjects;
    }
    public Subject getSubjectFormKeyboard() {
        System.out.println("Nhap ID: ");
        int iD = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap gia tien: ");
        long price = sc.nextLong();
        System.out.println("Nhap so nguoi dang ki hien tai: ");
        long currentMemberRegister = sc.nextLong();
        System.out.println("Nhap so nguoi dang ki toi da: ");
        long maxMemberRegister = sc.nextLong();

        return new Subject(iD, name, price, currentMemberRegister, maxMemberRegister);
    }

    public void initSubjectsDataFormKeyBoard() {
        for (int i = 0; i < subjects.length; i++) {
            this.subjects[i] = getSubjectFormKeyboard();
        }
    }

    public void printSubjects() {
        for (Subject monhoc : subjects) {
            System.out.println(monhoc.toString());
        }
    }

    public void printSubjectsCanRegister(Subject[] subjects) {
        for (Subject monhoc : subjects) {
            if (monhoc.canRegister()) {
                System.out.println(monhoc.toString());
            }
        }
    }

    public void registerSubjectById(int id) {
        var subject = findSubjectById(id);

        if (subject != null) {
            subject.register();
        }
//		for (Subject subject : subjects) {
//			if (subject.getiD() == id) {
//				subject.setCurrentMemberRegister(subject.getCurrentMemberRegister() + 1);
//			}
//		}
    }

    public Subject findSubjectById(int id) {
        for (Subject subject : subjects) {
            if (subject.getiD() == id)
                return subject;
        }
        return null;
    }

    public void addSubjectFromKeyBoard() {
        var subject = getSubjectFormKeyboard();
        addSubject(subject);
    }

    public  void addSubject(Subject subject) {
        if (containSubject(subject)) {
            System.out.print("Mon hoc da ton tai");
            return;
        }

        Subject[] subjectsTemp = new Subject[this.subjects.length + 1];

        for (int i = 0; i < subjects.length; i++) {
            subjectsTemp[i] = subjects[i];
        }
        subjectsTemp[subjects.length] = subject;

        this.subjects = subjectsTemp;
    }

    public void deleteSubjectById(int id) {
        if (findSubjectById(id)== null) {
            System.out.print("Mon hoc khong ton tai");
            return;
        }

        Subject[] subjectsTemp = new Subject[this.subjects.length - 1];
        var index = 0;
        for (Subject monhoc : subjects) {
            if (monhoc.getiD() != id) {
                subjectsTemp[index] = monhoc;
                index++;
            }
        }
        this.subjects=subjectsTemp;
    }

    public boolean containSubject(Subject subject) {
        return findSubjectById(subject.getiD()) != null;
    }
}

