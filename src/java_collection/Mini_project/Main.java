package java_collection.Mini_project;

public class Main {
    public static void main(String[] args) {
        EmployeeImplement obj=new EmployeeImplement();
        obj.addEmployee();


//        obj.display();
        /*
        try{
            Employee emp=obj.deleteEmp();
            System.out.println("ID: "+emp.getId());
            System.out.println("NAME: "+emp.getName());
            System.out.println("AGE: "+emp.getAge());
            System.out.println("SALARY: "+emp.getSalary());
        }catch (NullPointerException ex){
            System.out.println("ID not found here!");
        }

         */
        obj.display();
        obj.update();
        obj.display();
    }
}
