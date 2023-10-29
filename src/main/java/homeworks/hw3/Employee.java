package homeworks.hw3;

public class Employee {
    private String nameSurname;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(String nameSurname, String position, String email, String phoneNumber, int age) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String show(){
        return this.nameSurname + this.position + this.age + this.email + this.phoneNumber;
    }
}
