package java_collection.Mini_project;

import java.util.Scanner;
//This is a main function where we call all the methods here!!
public class Main {
    public static void main(String[] args) {
        EmployeeImplement obj=new EmployeeImplement();
        Scanner scan=new Scanner(System.in);
        int op;
        do{
            System.out.println("________1.ADD EMPLOYEE______________");
            System.out.println("________2.SHOW ALL EMPLOYEES________");
            System.out.println("________3.SEARCH EMPLOYEE___________");
            System.out.println("________4.DELETE EMPLOYEE___________");
            System.out.println("________5.UPDATE EMPLOYEE___________");
            System.out.println("________6.SORT BY ID________________");
            System.out.println("________7.EXIT THE PROGRAM________________");
            System.out.println("choice the option below: ");
            op=scan.nextInt();
           switch (op) {
                    case 1 -> obj.addEmployee();
                    case 2 -> obj.display();
                    case 3 -> obj.searchEmp();
                    case 4 ->obj.deleteEmp();
                    case 5->obj.update();
                    case 6->obj.sort();
                    case 7 -> System.out.println("Thanks for using our system!!!");
                }

        }while (op!=7);
    }
}
