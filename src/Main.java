package src;
import java.util.Scanner;
public class Main {

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
                int rollNumber;
                String name;
                int age;
                String department;
                String email;
                while(true){
                System.out.print("Enter student rollNumber : ");
                rollNumber = in.nextInt();
                in.nextLine();
                if(rollNumber>0){
                System.out.print("Enter Name : ");
                name = in.nextLine();
                System.out.print("Enter Age : ");
                age = in.nextInt();
                in.nextLine();
                System.out.print("Enter Departmet:");
                department = in.nextLine();
                System.out.print("Enter email : ");
                email =in.nextLine();
                Student student = new Student(rollNumber,name,age,department,email);
                sms.addStudent(student);
                break;
                }
                else{
                    System.out.println("Roll Number must be greater than 0.");
                }
            }
            break;
            case 2:
                sms.displayStudents();
                break;   
            case 3:
                System.out.print("Enter the roll number: ");
                rollNumber = in.nextInt();
                in.nextLine();
                Student stu = sms.searchStudent(rollNumber);
                if(stu!=null){
                System.out.print(stu);
                }
                else {
                    System.out.println("student not found");
                }
                break;
            case 4:
                System.out.print("Enter student rollNumber : ");
                rollNumber = in.nextInt();
                in.nextLine();
                System.out.print("Enter Name : ");
                name = in.nextLine();
                System.out.print("Enter Age : ");
                age = in.nextInt();
                in.nextLine();
                System.out.print("Enter Departmet:");
                department = in.nextLine();
                System.out.print("Enter email : ");
                email =in.nextLine();
            sms.updateStudent(rollNumber, name, age, department, email);
            break;
            case 5 :
                System.out.print("Enter rollNumber :");
                rollNumber = in.nextInt();
                in.nextLine();
                sms.deleteStudent(rollNumber);
                break;
            case 6:
                System.out.print("Thank you for using Student Management System.");
                break;
            default :
            System.out.println("Invalid input");
            break;
           }
 




       }
    }
    
    
}
