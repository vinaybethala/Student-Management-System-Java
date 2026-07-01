package src;
import java.util.Scanner;
public class Main {
    public static void addStudent(Scanner in,StudentManagementSystem sms){
        int rollNumber = readValidRollNumber(in);
        String name = readValidName(in);
        int age = readValidAge(in);
        String department = readValidDept(in);
        String email = readValidEmail(in);
        Student student = new Student(rollNumber,name,age,department,email);
        sms.addStudent(student);
    return;
    }
    public static void displayStudents(StudentManagementSystem sms){
        sms.displayStudents();
        return;
    }
    public static void searchStudent(Scanner in ,StudentManagementSystem sms){
        int rollNumber = readValidRollNumber(in);
                Student stu = sms.searchStudent(rollNumber);
                if(stu!=null){
                System.out.print(stu);
                }
                else {
                    System.out.println("student not found");
                }
        return;
    }
    public static void updateStudent(Scanner in,StudentManagementSystem sms){
        int rollNumber = readValidRollNumber(in);
          String name = readValidName(in);
               int  age = readValidAge(in);
                String department = readValidDept(in);
                String email = readValidEmail(in);
            sms.updateStudent(rollNumber, name, age, department, email);
        return;
    }
    public static void deleteStudent(Scanner in,StudentManagementSystem sms){
       int rollNumber = readValidRollNumber(in);
                sms.deleteStudent(rollNumber);
     return;
    }
      private static int readValidRollNumber(Scanner in){
        System.out.print("Enter student rollNumber : ");
        int rollNumber =in.nextInt();
        in.nextLine();
        if(rollNumber>0){
        return rollNumber;
        }
        else {
            System.out.println("rollNumber must be greater than 0");
            return readValidRollNumber(in);
        }

}
private static String readValidName(Scanner in){
    System.out.print("Enter Student Name: ");
    String name = in.nextLine();
    for(int i=0;i<name.length();i++){
        char ch =name.charAt(i);
        if(Character.isDigit(ch)){
            System.out.println("Name should not contain any digits!");
            return readValidName(in);
        }
    }
    return name;
}
private static int readValidAge(Scanner in){
    System.out.print("Enter age of the Student: ");
    int age = in.nextInt();
    in.nextLine();
    if(age>0 && age<=100){
        return age;
    }
    else {
        System.out.println("Invalid age, age should be between 0 and 100");
        return readValidAge(in);
    }
}
private static String readValidDept(Scanner in){
    System.out.print("Enter student department: ");
    String dept = in.nextLine().toLowerCase();
    if(dept.equals("cse")||dept.equals("aiml")||dept.equals("aids")||dept.equals("cs")){
        return dept;
    }
    else{
        System.out.println("Invalid department choose any one CSE, AIML, AIDS, CS");
        return readValidDept(in);
    }
}
private static String readValidEmail(Scanner in){
  System.out.print("Enter email id: ");
  String email =in.nextLine();
  if(email.contains("@")){
   if(email.contains(".")){
    if(email.indexOf("@")!=0 && email.indexOf("@")!=email.length()-1){
      if(email.indexOf("@")<email.indexOf(".")){
        int count =0;
        int dot =0;
        for(int j=0;j<email.length();j++){
            char con =email.charAt(j);
            if (con == '@'){
                count++;
            }
            else if(con == '.'){
                dot++;
            }
        }
        if(count==1 && dot>=1){
            return email;
        }
        else{
            System.out.println("invalid mail");
            return readValidEmail(in);
        }
      }else{
        System.out.println("invalid mail");
        return readValidEmail(in);
      }
    }
    else{
        System.out.println("invalid mail");
        return readValidEmail(in);
    }
   }else{
    System.out.println("invalid mail");
    return readValidEmail(in);
   }
  }else{
    System.out.println("Invalid Mail");
    return readValidEmail(in);
  }
 }
    public static void main(String[] args) {  
        Scanner in = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
       while (true) { 
           System.out.println("==============================");
           System.out.println("Student Management System");
           System.out.println("================================");
           System.out.println("1.  Add Student");
           System.out.println("2. Display Students");
           System.out.println("3. Search Student");
           System.out.println("4. Update Student");
           System.out.println("5. Delete Student");
           System.out.println("6. Exit");
           System.out.println();
           System.out.print("Enter your choice : ");
           int choice = in.nextInt();
           switch(choice){
            case 1 :
                addStudent(in, sms);
            break;
            case 2:
                displayStudents(sms);
                break;   
            case 3:
                searchStudent(in,sms);
                break;
            case 4:
                updateStudent(in, sms);
            break;
            case 5 :
                deleteStudent(in, sms);
                break;
            case 6:
                System.out.print("Thank you for using Student Management System.");
                return;
            default :
            System.out.println("Invalid input");
            break;
           }
       }
    }
    
    
}
