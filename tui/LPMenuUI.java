package tui;
import java.util.Scanner;
/**
 * Write a description of class LånerMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LPMenuUI
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class LånerMenu
     */
    public LPMenuUI()
    {
        
        
    }

    public void start() {
        boolean running = true;
        while (running) {
            int choice = writeLPMenu();
            switch (choice) {
                case 1:
                System.out.println("Denne er ikke implementeret endnu");
                break;
                case 2:
                System.out.println("Denne er ikke implementeret endnu");
                break;
                case 3:
                System.out.println("Denne er ikke implementeret endnu");
                break;
                case 4:
                System.out.println("Denne er ikke implementeret endnu");
                break;
                case 0:
                System.out.println("Tak for denne gang.");
                running = false;
                break;
                default:
                System.out.println("Der er sket en uforklarlig fejl, choice = "+choice);
                break;
            }
        }
    }

    private int writeLPMenu() {
        Scanner keyboard = new Scanner(System.in);    
        System.out.println("****** Låner Menu ******");
        System.out.println(" (1) Tilføj LP");
        System.out.println(" (2) Rediger LP");
        System.out.println(" (3) Find LP");
        System.out.println(" (4) Print information om LP");// will generate testdata, delete in final version
        System.out.println(" (0) Tilbage");
        System.out.print("\n Vælg:");
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
}