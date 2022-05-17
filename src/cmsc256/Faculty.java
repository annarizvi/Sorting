/*

 *  Faculty

 *  Represents a person extending Employee class, extra instance variable of
    rank

 *

 * CMSC 256 Project 1

 * @author Anna Rizvi

 */

package cmsc256;

public class Faculty extends Employee {

    //declare instance variable
    private String rank;


    //initialize void constructor
    public Faculty(){
        super(); //calls default constructor in Employee
        rank = "Instructor";
        new Employee();
    }

    //parameterized constructor
    public Faculty(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year, String rank) {

        super(first, middle, last, homeAddress, phoneNumber, email, office, salary, month, day, year);

        //checking to see if level is valid
        if(isValidRank(rank)) {
            this.rank = rank;
            new Employee(first, middle, last, homeAddress, phoneNumber, email, office, salary, month, day, year);
        }
        else{
            throw new IllegalArgumentException();                         //System.out.println("IllegalArgumentException");
        }

    }

    //getter for rank
    public String getRank() {
        return rank;
    }
    //setter for rank
    public void setRank(String rank){
        this.rank = rank;
    }


    //isValidRank boolean
    private boolean isValidRank(String rank){
        boolean valid;
        if((rank.equals("Adjunct")) || (rank.equals("Assistant Professor")) || (rank.equals("Associate Professor")) || (rank.equals("Professor"))) {
            valid = true;
        }
        else{
            valid = false;
        }
        return valid;
    }

    public String toString() {
        return super.toString() + "\nRank: " + rank;
    }


}
