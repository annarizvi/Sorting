/*

 *  Student

 *  Represents a student, extension of Person class
    and creates a new person who
 *  will be assigned a level (freshman, sophomore, etc.)

 *

 * CMSC 256 Project 1

 * @author Anna Rizvi

 */

package cmsc256;


public class Student extends Person {

private String level;

//default constructor
public Student() {
    super(); //calls default constructor of parent class person
    level = "Freshman";
    new Person();

}

//parameterized constructor
public Student(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String level){

    super(first, middle, last, homeAddress, phoneNumber, email); //calls param. const. in Person class

    //checking to see if level is valid
    if(isValidLevel(level)) {
        this.level = level;
        new Person(first, middle, last, homeAddress, phoneNumber, email);//calling person class whose parameters have already been defined
    }
    else{
        throw new IllegalArgumentException();                        //System.out.println("java.lang.IllegalArgumentException");
    }


}


    //getter and setters

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    //verifying that level is one of the accepted values
    private boolean isValidLevel(String level){
        boolean valid;
        if((level.equals("Freshman")) || (level.equals("Sophomore")) || (level.equals("Junior")) || (level.equals("Senior")) || (level.equals("Graduate"))) {
            valid = true;
        }
        else{
            valid = false;
        }
        return valid;
    }

    //super.toString() calls the info from our parent class
    public String toString(){
        return super.toString() + "\nStudent Level: " + level;

    }




}
