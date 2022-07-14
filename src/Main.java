import java.util.Scanner;

public class Main {

    public static Employee getEmployeeDetails(){
        Employee e1=new Employee();
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter id");
        e1.setEmployeeId(s1.nextInt());
        System.out.println("Enter name");
        e1.setEmployeeName(s1.next());
        System.out.println("Enter salary");
        e1.setSalary(s1.nextInt());



//        e1.getEmployeeId();
//        e1.getEmployeeName();
//        e1.getSalary();

        return e1;
    }
    public static int getPFPercentage(){
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter pf percentage");

        return  s2.nextInt();
    }
    public static void main(String[] args) {
       Employee e1= getEmployeeDetails();
//       e1.getSalary();
//       e1.getEmployeeId();
//       e1.getEmployeeName();

        int i= getPFPercentage();
        System.out.println("id is "+ e1.getEmployeeId());
        System.out.println("name is "+e1.getEmployeeName());
        System.out.println("salary is "+e1.getSalary());
        System.out.println("pf percentage is "+i);


        e1.calculateNetSalary(i);



    }
}
