package StudentRecordManagementSystem;
import java.util.*;


public class studentRecordSystem {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        int id=0;
        float marks;
        int operation;

        while(exit){
            System.out.println("\nEnter the Operation you want to perform: \n");
            System.out.println("1)Add a Student\n2)View Students\n3)Update\n4)Delete\n5)Exit\n");
            operation = scanner.nextInt();
            scanner.nextLine();
            if(operation==5){
                exit = false;
                break;
            }

            switch(operation){
                case 1:
                    System.out.println("Enter Student name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter marks obatined: ");
                    marks = scanner.nextFloat();
                    addStudent(students,++id,name,marks);
                    System.out.println("Student "+name+" was added successfully!\n");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\nStudent List: ");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the student Id to update: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the name to update: ");
                    name = scanner.nextLine();
                    System.out.println("Enter the marks to update: ");
                    marks = scanner.nextFloat();
                    for(Student s:students){
                        if(s.getId()==newId){
                            s.setName(name);
                            s.setMarks(marks);
                        }
                    }
                    System.out.println("Changes done successfully!");
                    break;

                case 4:
                    System.out.println("Enter the student Id to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean removed = false;

                    Iterator<Student> iterator = students.iterator();
                    while(iterator.hasNext()){
                        Student s = iterator.next();
                        if(s.getId() == deleteId){
                            iterator.remove();  // safe removal while iterating
                            removed = true;
                            System.out.println("Element deleted successfully!!");
                            break;
                        }
                    }
                    if(!removed){
                        System.out.println("Student not found!");
                    }
                    break;


                default:
                    System.out.println("Invalid operation! Please enter 1-5.");
            }
        }
        System.out.println("System Closed Successfully!!");
    }

    static void addStudent(List<Student>students,int id,String name,float marks){
        Student student = new Student(id,name,marks);
        students.add(student);
    }

}