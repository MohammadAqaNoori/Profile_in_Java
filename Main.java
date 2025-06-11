import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Welcome to Aqa Noori Profile System ====");

        // Password system
        System.out.print("Enter password to access: ");
        String password = input.nextLine();

        if (!password.equals("aqa123")) { // You can change this password
            System.out.println("Access Denied! Exiting...");
            return;
        }

        System.out.println("Access Granted! Welcome to the system.");

        int choices;

        do {
            System.out.println("\n===========================================");
            System.out.println("               Aqa Noori Profile           ");
            System.out.println("===========================================");
            System.out.println("1. About Me");
            System.out.println("2. My Education");
            System.out.println("3. My Projects");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choices = input.nextInt();
            input.nextLine(); // Clear the newline

            switch (choices) {
                case 1:
                    System.out.println("\n--- About Me ---");
                    System.out.println("My name is Mohammad Aqa Noori, a passionate software engineer from Kabul, Afghanistan.");
                    System.out.println("I am 18 years old, currently pursuing higher education in Pakistan.");
                    System.out.println("I believe that technology can transform lives, and I am driven by a dream to represent Afghanistan on international platforms through innovation.");
                    System.out.println("Every day, I strive to improve myself, build powerful skills, and contribute to a brighter future for my people.");
                    pause(input);
                    break;

                case 2:
                    System.out.println("\n--- My Education ---");
                    System.out.println("My educational journey started in a small village, where I faced many challenges but never gave up on my dreams.");
                    System.out.println("I completed my high school education in Kabul with determination and strong ambition.");
                    System.out.println("Currently, I am studying Software Engineering at COMSATS University Islamabad, one of the top universities in Pakistan.");
                    System.out.println("At the same time, I am pursuing a Computer Science degree at the University of the People, USA, to further enhance my global knowledge.");
                    System.out.println("I continuously learn, build projects, and challenge myself to become one of the top engineers in the future.");
                    pause(input);
                    break;

                case 3:
                    System.out.println("\n--- My Projects ---");
                    System.out.println("As a second-semester student, I am proud to have completed the following projects:");
                    System.out.println("1. Portfolio Website");
                    System.out.println("2. E-Commerce Website");
                    System.out.println("3. Hand-Tracking Game in Python");
                    System.out.println("4. Bank Management System in Java");
                    System.out.println("5. Advanced Calculator using HTML, CSS, and JS");
                    System.out.println("And many more exciting projects coming soon...");
                    pause(input);
                    break;

                case 4:
                    System.out.println("\nExiting from the system. Thank you for visiting my profile!");
                    break;

                default:
                    System.out.println("\nInvalid choice, please try again!");
            }
        } while (choices != 4);

        input.close();
    }

    // Method to pause after each section
    public static void pause(Scanner input) {
        System.out.println("\nPress Enter to return to the menu...");
        input.nextLine();
    }
}
