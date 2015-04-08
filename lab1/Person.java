package EPAM2015_lab1.lab1; /**
 *Includes classes related to laboratory task number 1
 */

/**
 * Entity of class Person represents a person, which has following properties:
 * first name, last name, date of birth
 * @author Terletskiy Sergey
 */
public class Person {
    private String firstName;
    private String lastName;
    private String dob;

    /**
     * Constructs entity of class Person with the given first name, last name and date of birth
     *
     * @param firstName String variable, that represents person's first name
     * @param lastName  String variable, that represents person's first name
     * @param dob       String variable, that represents person's date of birth
     */
    public Person(String firstName, String lastName, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    /**
     * Gets from entity incapsulated value of first name
     *
     * @return incapsulated String value of first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets from entity incapsulated value of last name
     *
     * @return incapsulated String value of last name
     */

    public String getLastName() {
        return lastName;
    }

    /**
     * Gets from entity incapsulated value of date of birth
     *
     * @return incapsulated String date of birth value
     */

    public String getDob() {
        return dob;
    }

    /**
     * Overrides Object's standard implementation and returns String representation of Person entity,
     * which includes indication of entity properties (first name, last name, date of birth).
     * @return String representation of entity
     */
    public String toString() {
        return
                "Person: " + "\nfirst name: " + firstName + ";"
                        + "\nlast name: " + lastName + ";"
                        + "\nDOB: " + dob + ";";
    }
}
