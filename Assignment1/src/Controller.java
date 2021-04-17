import java.util.*;

public class Controller
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        try {
            do {
                Item i = new Item();
                System.out.println("\nEnter Item Details:");

                System.out.print("Name: ");
                i.setName(sc.next());

                System.out.print("Price: ");
                double p = sc.nextDouble();
                if (p < 0.0)
                    throw new ArithmeticException("Price can't be negative");
                else
                    i.setPrice(p);

                System.out.print("Quantity: ");
                int q = sc.nextInt();
                if (q < 0)
                    throw new ArithmeticException("Quantity can't be negative");
                else
                    i.setQuantity(q);

                System.out.print("Type: ");
                String t = sc.next();
                if (!(t.equals("Raw") || t.equals("Manufactured") || t.equals("Imported")))
                    throw new InputMismatchException("Invalid Type");
                else
                    i.setType(t);

                displayFinalPrice(i);
                System.out.print("\nDo you want to enter details of any other item (y/n): ");
            }
            while (sc.next().equalsIgnoreCase("y"));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static void displayFinalPrice(Item i)
    {
        double tax=0.0,price=i.getPrice();

        if(i.getType().equals("Raw"))
        {
            tax=0.125*price;
        }
        else if(i.getType().equals("Manufactured"))
        {
            tax=(0.125*price)+(0.02*(price+(0.125*price)));
        }
        else
        {
            tax=0.1*price;

            if(price+tax<=100)
                tax+=5;
            else if(price+tax<=200)
                tax+=10;
            else
                tax+=(0.05*(price+tax));
        }
        System.out.println("\nItem Name: "+i.getName());
        System.out.println("Item Price: "+i.getPrice());
        System.out.println("Sales Tax per Item: "+tax);
        System.out.println("Final Price: "+((price+tax)*i.getQuantity()));
    }
}
