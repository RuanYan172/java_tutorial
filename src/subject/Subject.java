package subject;

public class Subject {
    private int iD;
    private String name;
    private long price;
    private long currentMemberRegister;
    private long maxMemberRegister;

    public Subject() {

    }

    public Subject(int iD, String name, long price, long currentMemberRegister, long maxMemberRegister) {
        this.iD = iD;
        this.name = name;
        this.price = price;
        this.currentMemberRegister = currentMemberRegister;
        this.maxMemberRegister = maxMemberRegister;
    }

    public boolean canRegister() {
        return currentMemberRegister < maxMemberRegister;
    }

    public void register() {
        if (canRegister())
            this.currentMemberRegister++;
    }

    @Override
    public String toString() {
        return "Ma ID: " + iD + " \n\t Ten la: " + name + " \n\t Gia tien: " + price
                + " \n\t Thanh vien dang ki hien tai: " + currentMemberRegister + " \n\t Thanh vien dang ki toi da: "
                + maxMemberRegister;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Subject && this.iD == ((Subject) obj).getiD();
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getCurrentMemberRegister() {
        return currentMemberRegister;
    }

    public void setCurrentMemberRegister(long currentMemberRegister) {
        this.currentMemberRegister = currentMemberRegister;
    }

    public long getMaxMemberRegister() {
        return maxMemberRegister;
    }

    public void setMaxMemberRegister(long maxMemberRegister) {
        this.maxMemberRegister = maxMemberRegister;
    }
}

