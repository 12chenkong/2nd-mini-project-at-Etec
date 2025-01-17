package java_collection.Mini_project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
// Here is the place where we implement  every method
public class EmployeeImplement {
    Scanner scanner=new Scanner(System.in);
    List<Employee>employeeList=new ArrayList<>();
    public EmployeeImplement(){}
    //inserting employee to the list
    public void addEmployee(){
        System.out.println("Enter number of employee:");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            System.out.println("Enter your ID:");
            int id=scanner.nextInt();
            System.out.println("Enter your name: ");
            scanner.nextLine();
            String name=scanner.nextLine();
            System.out.println("Enter your salary:");
            double salary=scanner.nextDouble();
            System.out.println("Enter your age:");
            int age=scanner.nextInt();
            Employee obj=new Employee(id,name,salary,age);
            employeeList.add(obj);
        }
    }
  // show all the info of employee in the list
    public  void display(){
        System.out.println("Here is the info of Employees");
        for (Employee employee : employeeList) {
            System.out.println("ID: " + employee.getId());
            System.out.println("NAME: " + employee.getName());
            System.out.println("AGE: " + employee.getAge());
            System.out.println("SALARY: " + employee.getSalary()+"$");
            System.out.println(" ");
        }
    }
    // Search for Certain employee based on entered id
    public  void searchEmp(){
        System.out.println("Enter id to search an employee:");
        int searchId=scanner.nextInt();
        boolean status=false;
        for(Employee i:employeeList){
            if(i.getId()==searchId){
                System.out.println("ID: "+i.getAge());
                System.out.println("NAME: "+i.getName());
                System.out.println("AGE: "+i.getAge());
                System.out.println("SALARY: " +i.getSalary()+"$");
                status=true;
            }
        }
        if(!status){
            System.out.println(searchId+" not found in the our system!!");
        }

    }
    //Delete employee based on entered ID
    public void deleteEmp(){
        System.out.println("Enter id to remove employee: ");
        int removeId=scanner.nextInt();
        boolean status=false;
        for(int i=0;i<employeeList.size();i++){
            if(employeeList.get(i).getId()==removeId){
                employeeList.remove(i);
                status=true;
                break;
            }
        }
        if(status){
            System.out.println("Delete successfully");
        }else
            System.out.println("ID not found in the system!!");
    }
    //Update employee's info based entered id
    public  void update(){
        System.out.println("Enter ID to update employee info: ");
        boolean status=false;
        int updateId=scanner.nextInt();
        for (Employee employee : employeeList) {
            if (employee.getId() == updateId) {
                scanner.nextLine();
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Enter your salary:");
                double salary = scanner.nextDouble();
                System.out.println("Enter your age: ");
                int age = scanner.nextInt();
               employee.setName(name);
               employee.setAge(age);
               employee.setSalary(salary);
               status=true;

            }
        }
        if(!status){
            System.out.println("ID not found in the list");
        }
    }
    // Sorting employee object base on give ID
 public void sort(){
        employeeList.sort(new SortById());
        for (Employee i:employeeList){
            System.out.println(i);
        }
 }
}





