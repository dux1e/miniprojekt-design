package tui;
import java.util.Scanner;
public class MainMenuUI
{
    private LånerMenuUI lånerMenuUI;
    private LPMenuUI lpMenuUI;

    public MainMenuUI()
    {
        this.lånerMenuUI = new LånerMenuUI();
        this.lpMenuUI = new LPMenuUI();
    }

    public void start(){
        hovedMenu();
    }

    private void hovedMenu(){
        boolean running = true;
        while (running) {
            int choice = writeMainMenu();
            switch (choice) {
                case 1:
                lånerMenuUI.start();
                break;
                case 2:
                lpMenuUI.start();
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

    private int writeMainMenu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("****** Hovedmenu ******");
        System.out.println(" (1) Lånermenu");
        System.out.println(" (2) LP menu");
        System.out.println(" (3) Udlånsmenu");
        System.out.println(" (4) Generer testdata");// will generate testdata, delete in final version
        System.out.println(" (0) Afslut programmet");
        System.out.print("\n Vælg:");
        while (!keyboard.hasNextInt()) {
            System.out.println("Input skal være et tal - prøv igen");
            keyboard.nextLine();
        }
        int choice = keyboard.nextInt();
        return choice;
    }
}
