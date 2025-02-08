import java.util.*;

public class Showroom implements Utility
{
   String showroom_name;
   String showroom_address;
   int total_employee;
   int total_cars_in_stock=0;
   String manager_name;
   @Override
   public void get_detail()
   {
       System.out.println("Showroom Name:"+showroom_name);

       System.out.println("Showroom Address:"+showroom_address);

       System.out.println("Total Employee:"+total_employee);

       System.out.println("total_cars_in_stock:"+total_cars_in_stock);

       System.out.println("Manager Name:"+manager_name);

   }
   @Override
   public void set_detail()
   {
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter the Showroom name");
       showroom_name=sc.nextLine();
       System.out.println("Enter the Showroom Address");
       showroom_address=sc.nextLine();
       System.out.println("Enter number of total employee");
       total_employee=sc.nextInt();
       System.out.println("Enter number of total cars in stock");
       total_cars_in_stock=sc.nextInt();
       System.out.println("Enter the Manager name");
       manager_name=sc.nextLine();
   }



}

