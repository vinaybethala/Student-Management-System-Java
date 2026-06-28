package src;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String department;
    private String email;

    public Student(int rollNumber, String name, int age, String department, String email) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.department = department;
        this.email = email;
    }
//since student info is private to access them we will use Getters and setters 
    public String getName() { // get returns value so return type is there 
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public void setrollNumber(int rollNumber) { //set upadates a value so no return type
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + "\nName: " + name + "\nAge: " + age + "\nDepartment: " + department
                + "\nEmail: " + email;
    }

}
