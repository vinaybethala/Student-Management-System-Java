package src;

public class Main {

    public static void main(String[] args) {  
        Student s1 = new Student(101,"vinay",22,"AIML","vinay@gmail.com");
   StudentManagementSystem sms = new StudentManagementSystem();
   sms.addStudent(s1);
   sms.updateStudent(101, "rahul", 44,"CSE","rahul@gmail.com");
   sms.displayStudents();
   sms.deleteStudent(101);
    }
    

}
