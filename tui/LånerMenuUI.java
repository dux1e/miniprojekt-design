package tui;
import java.util.Scanner;
import controller.*;

/**
 * Write a description of class LånerMenu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LånerMenuUI
{
   private LoanController loanController;
    

    /**
     * Constructor for objects of class LånerMenu
     */
    public LånerMenuUI()
    {
        loanController = new LoanController();
        
    }

    public void start() {
        boolean running = true;
        while (running) {
            int choice = writeLånerMenu();
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

    private int writeLånerMenu() {
        Scanner keyboard = new Scanner(System.in);    
        System.out.println("****** Låner Menu ******");
        System.out.println(" (1) Opret Lån");
        System.out.println(" (2) Indfri Lån");
        System.out.println(" (3) Find Låner");
        System.out.println(" (4) Print information om Låner");// will generate testdata, delete in final version
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