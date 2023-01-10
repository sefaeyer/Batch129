package ssg19;

public class StudentExc {

    String name;
    int age;
    int grade;
    String stdId;
    String address;

    public StudentExc(String name, int age, int grade, String stdId, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.address = address;
    }

    public StudentExc(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentExc{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", stdId='" + stdId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
