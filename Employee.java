import java.util.*;
public class Employee  implements Utility
{
   String emp_name;
   int emp_id ;
   int emp_age;
   String emp_department;
   String showroom_name;
   @Override
   public void get_detail()
   {
       System.out.println("Employee Name:"+emp_name);

       System.out.println("Employee Age:"+emp_age);

       System.out.println("Employee ID:"+emp_id);

       System.out.println("Employee Department:"+emp_department);

       System.out.println("Showroom Name:"+showroom_name);
   }
   public void set_detail()
   {
       System.out.println("*******Enter Employee Detail*******");
       System.out.println();


       Scanner ip=new Scanner(System.in);
       Random rn=new Random();
       emp_id=rn.nextInt();
       System.out.println("Enter employee name:");
       emp_name=ip.nextLine();
       System.out.println("Enter employee age:");
       emp_name=ip.nextLine();
       System.out.println("Enter employee department:");
       emp_department=ip.nextLine();
       System.out.println("Enter employee's showroom name:");
       showroom_name=ip.nextLine();



   }

}

