
import java.util.*;

interface Utility
{
   public void get_detail();
   public void set_detail();
}
public class Main
{
   public static void main_menu()
   {
       System.out.println("**********WELCOME TO SHOWROOM MANAGEMENT SYSTEM**********");
       System.out.println();
       System.out.println();

       System.out.println("       **********ENTER YOUR CHOICE**********");
       System.out.println("1) Add Showroom\t\t\t2)Add Employee\t\t\t3)Add Car");
       System.out.println("4) get Showroom\t\t\t5)get Employee\t\t\t6)get Car");

       System.out.println("       **********ENTER 0 TO EXIT**********");
   }

   public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       Showroom showroom[] = new Showroom[5];
       Employee emp[] = new Employee[5];
       Car car[] = new Car[5];
       int showroom_counter = 0;
       int emp_counter = 0;
       int car_counter = 0;
       int choice = 100;
       while (choice != 0) {
           main_menu();
           choice = input.nextInt();
           while (choice != 9 && choice != 0) {
               switch (choice) {
                   case 1:
                       showroom[showroom_counter] = new Showroom();
                       showroom[showroom_counter].set_detail();
                       showroom_counter++;
                       System.out.println();
                       System.out.println("1) Add new showroom");
                       System.out.println("9) Go back");
                       choice = input.nextInt();
                       break;

                   case 2:
                       emp[emp_counter] = new Employee();
                       emp[emp_counter].set_detail();
                       emp_counter++;
                       System.out.println();
                       System.out.println("1) Add new employee");
                       System.out.println("9) Go back");
                       choice = input.nextInt();
                       break;

                   case 3:
                       car[car_counter] = new Car();
                       car[car_counter].set_detail();
                       car_counter++;
                       System.out.println();
                       System.out.println("1) Add new car");
                       System.out.println("9) Go back to main menu");
                       choice = input.nextInt();
                       break;

                   case 4:
                       if(showroom_counter==0)
                       {
                           System.out.println("oops! no any Showroom");
                       }
                       for (int i = 0; i < showroom_counter; i++) {
                           showroom[i].get_detail();
                           System.out.println();
                           System.out.println();
                       }
                       System.out.println();
                       System.out.println("0) Exit) ");
                       System.out.println("9) Go back to main menu");
                       choice = input.nextInt();
                       break;

                   case 5:
                       if(emp_counter==0)
                       {
                           System.out.println("oops! no any Employee");
                       }
                       for (int i = 0; i < emp_counter; i++) {
                           emp[i].get_detail();
                           System.out.println();
                           System.out.println();
                       }
                       System.out.println();
                       System.out.println("0) Exit");
                       System.out.println("9) Go back to main menu");
                       choice = input.nextInt();
                       break;
                   case 6:
                       if(car_counter==0)
                       {
                           System.out.println("oops! no any Car");
                       }
                       for (int i = 0; i < car_counter; i++) {
                           car[i].get_detail();
                           System.out.println();
                           System.out.println();
                       }
                       System.out.println();
                       System.out.println("0) Exit) ");
                       System.out.println("9) Go back to main menu");
                       choice = input.nextInt();
                       break;
                   default:
                       System.out.println("oops! invalid input");
                       break;


               }
           }

       }


   }



   }

