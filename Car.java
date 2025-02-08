import java.util.*;
public class Car implements Utility
{
   String Car_name;
   String Car_color;
   String Car_fuel_type;
   int Car_price;
   String Car_model;
   String Car_mileage;
   String showroom_name;

   public void get_detail()
   {
       System.out.println("Car Name:" + Car_name);

       System.out.println("Car color:" + Car_color);
       System.out.println("Car fuel type:" + Car_fuel_type);
       System.out.println("Car price:" + Car_price);
       System.out.println("Car model:" + Car_model);
       System.out.println("Car total mileage:" + Car_mileage);
       System.out.println("Car color:" + Car_color);
       System.out.println("Car's showroom name:" + showroom_name);
   }

   public void set_detail()
   {
       System.out.println("*******Enter Car's Detail*******");
       Scanner ip = new Scanner(System.in);
       System.out.println("Enter car name:");
       Car_name = ip.nextLine();
       System.out.println("Enter car color:");
       Car_color = ip.nextLine();
       System.out.println("Enter car fuel type:");
       Car_fuel_type = ip.nextLine();
       System.out.println("Enter car price:");
       Car_price = ip.nextInt();
       System.out.println("Enter car model:");
       Car_model = ip.nextLine();
       System.out.println("Enter car total mileage:");
       Car_mileage = ip.nextLine();
       System.out.println("Enter car showroom name:");
       showroom_name = ip.nextLine();
   }


}

