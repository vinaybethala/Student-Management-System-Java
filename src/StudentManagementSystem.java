package src;
import java.util.ArrayList;
public class StudentManagementSystem{
   private ArrayList<Student> students; //instead of adding new student we created Arraylist

   public StudentManagementSystem() {    //public method to perform operations
       this.students = new ArrayList<>();
    
   }
   //add student
   public void addStudent(Student student){
    if(searchStudent(student.getRollNumber())!=null){ // before adding student we need to check whether the student is already present so calling search method again
     System.out.println("Student with Roll Number"+student.getRollNumber()+" already exists.");
    }
    else{
    students.add(student);
    System.out.println("Student added successfully.");
    }
   }
  // display student
   public void displayStudents(){
    if(students.isEmpty()){
        System.out.println("No students found");
        return;
    }
  for(Student student : students){
    System.out.println(student);
    System.out.println("-------------------------");
  }
}
//search of a student
  public Student searchStudent(int rollNumber){
  for(Student student:students){   //if the current student == target then return student
   if(student.getRollNumber()==rollNumber){
     return student;
    }
  }
  return null;
   }
   // update student
   public void updateStudent(int rollNumber,String name,int age ,String department,String email){
    Student student = searchStudent(rollNumber);
    if(student == null){
      System.out.println("Student not found ");
    }
    else {
    student.setName(name);
    student.setAge(age);
    student.setDepartment(department);
    student.setEmail(email);

    System.out.println("Student updated successfully.");
    }
   }
   // delete student
   public void deleteStudent(int rollNumber){
    Student student = searchStudent(rollNumber);
    if(student !=null){
      students.remove(student);
      System.out.println("Student deleted sucessfully");
    }
    else {
  System.out.println("student not found");
    }
   }
  }


