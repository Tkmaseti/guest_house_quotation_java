import java.util.Scanner;



public class guest_house_quotation {
    public static void main(String[] args) {
        // write your code here
            Scanner scanner = new Scanner(System.in);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Surname: ");
            String surname = scanner.nextLine();
            Scanner scanner2 = new Scanner(System.in);
            System.out.print("Place: ");
            String place = scanner.nextLine();
            Scanner scanner3 = new Scanner(System.in);
            System.out.print("Age: ");
            int age = scanner.nextInt();
            if (age >= 18)
                System.out.println("Hello " + name + surname + "from" + place);
            else
                System.out.println("Sorry you are not old enough to book a house " + name + surname + " from " + place);
            Scanner scanner4 = new Scanner(System.in);
            System.out.print("Guests: ");
            int guest = scanner.nextInt();
            Scanner scanner5 = new Scanner(System.in);
            System.out.print("Stays: ");
            int stays = scanner.nextInt();
    
            int total = guest + stays;
            System.out.println("The amount will be: " + total );
        }
}
