package EPAM2015_lab1.lab1;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Person runner is a service class, which helps to check the functionality of lab1.Person
 */
public class PersonRunner {

    private static final int CREATE_PERSON_MENU_ITEM = 1;
    private static final int SHOW_PERSON_MENU_ITEM = 2;
    private static final int EXIT_MENU_ITEM = 0;

    private Person person;
    private Scanner scanner;
/**
* Constructs entity of PersonalRunner class
*/
    public PersonRunner() {
        this.scanner = new Scanner(System.in);
    }
/**
* Starts console application
*/
    public void start() {
        do {
            clrScr();
            menuPrint();
            switch (askUserMenuItem()) {
                case CREATE_PERSON_MENU_ITEM:
                    clrScr();
                    createPerson();
                    break;
                case SHOW_PERSON_MENU_ITEM:
                    clrScr();
                    showPerson();
                    break;
                case EXIT_MENU_ITEM:
                    return;
            }
            System.out.print("\nPress \"Enter\" to return to main menu ");
            scanner.nextLine();
        } while (true);
    }

    private int askUserMenuItem() {
        Pattern pattern = Pattern.compile("[0-2]");
        System.out.print("\nEnter menu item: ");
        String userInput;
        while (!pattern.matcher(userInput = scanner.nextLine()).matches()) {
            System.out.print("Enter valid menu item: ");
        }
        return Integer.parseInt(userInput);
    }

    private void showPerson() {
        System.out.println(person);
    }

    private void clrScr() {
        for (int i = 0; i < 25; i++) {
            System.out.println("\n");
        }
    }

    private void createPerson() {
        System.out.print("Enter person first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter person last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter person date of birth (dd.mm.yyyy): ");
        String dob = scanner.nextLine();
        this.person = new Person(firstName, lastName, dob);
    }

    private void menuPrint() {
        System.out.println("         MENU");
        System.out.println("---------------------");
        System.out.println("1. Create new person.");
        System.out.println("2. Show person.");
        System.out.println("---------------------");
        System.out.println("0. Exit.");
    }

    public static void main(String[] args) {
        new PersonRunner().start();
    }
}
