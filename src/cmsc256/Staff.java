/*

 *  Staff

 *  Represents the title of an employee through instance variable title

 *

 * CMSC 256 Project 1

 * @author Anna Rizvi

 */

package cmsc256;

public class Staff extends Employee {


    //instance variable
    private String title;


    //initialize void constructor
    public Staff(){
        super(); //calls default constructor in Employee class
        title = "None given";
        new Employee();
    }

    //parameterized constructor
    public Staff(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year, String title) {
        super(first, middle, last, homeAddress, phoneNumber, email, office, salary, month, day, year);
        this.title = title;
    }

    //getters n setters

    //getter title
    public String getTitle() {
        return title;
    }
    //setter title
    public void setTitle(String title){
        this.title = title;
    }

    //toString
    public String toString() {
        return super.toString() + "\nTitle: " + title;

    }


}
