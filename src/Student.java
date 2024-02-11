public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }
}
