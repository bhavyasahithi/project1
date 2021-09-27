package project2;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
import java.util.Scanner;

public class Projectmain {
	public static void main(String[] args) {
		Menuoptions.printWelcomeScreen("Welcome1" , "Bhavya");
		handleWelcomeScreenInput();
	}
	private static void handleWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Menuoptions.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					//Fileoperations.displayAllFiles("./main");
					Fileoperations.displayAllFiles("main");
					break;
				case 2:
					Menuoptions.handleFileMenuOptions();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				handleWelcomeScreenInput();
			} 
		} while (running == true);
	}
}
		