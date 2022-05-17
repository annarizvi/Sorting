/*

 *  Person

 *  Represents a person and creates a new person who
 *  will be assigned to ID variable.

 *

 * CMSC 256 Project 1

 * @author Anna Rizvi

 */


package cmsc256;

public class Person {

   //declare instance variables
   private int id;
   private Name name;
   private Address homeAddress;
   private String phoneNumber;
   private String email;
   private static int recordNumber = 0;

   //assign default values
    public Person() {

            name = new Name();
            homeAddress = new Address();
            phoneNumber = "None given";
            email = "None given";
            recordNumber++;
            id = recordNumber;
        }

    //parameterized constructor, passes in values and defines them
    public Person(String first, String middle, String last, Address homeAddress, String phoneNumber, String email) {
        // setting new name
        name = new Name(first,middle,last);
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        recordNumber++;
        this.id = recordNumber;
    }

    //getters and setters (accessor/mutator)
//** QUESTIONS: are my getters ok? do i make the setters = void or the name of the variable?


    //getter Address
    public Address getHomeAddress() {
        return homeAddress;
    }
    //setter Address
    public void setHomeAddress(Address address) {
        this.homeAddress = address;
    }


    //getter phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }
    //setter phoneNumber
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    //getter email
    public String getEmail(){
        return email;
    }
    //setter email
    public void setEmail(String email){
        this.email = email;
    }


    //getter for id
    public int getId(){
        return id;
    }

    //getter for Name
    public String getName(){
        return name.toString();
    }
    //setter for Name
    public void setName(Name name){
        this.name = name;
    }

    // "\n" is newline character. This function returns all variables concatenated.
    public String toString(){
        return this.getClass().getSimpleName() + "Person:\n ---------------------------------------\n" + name.toString() + "\n---------------------------------------\n" + "Home Address: " + homeAddress.toString() + "\n" + "\nPhone Number: " + phoneNumber + "\nEmail Address: " + email + "\nID: " + id;

    }

        //"Person: \n ---------------------------------------" + name.toString() + "\n---------------------------------------\n" + "Home Address: " + homeAddress.toString() + "\n" + homeAddress.toString() + "\nPhone Number: " + phoneNumber + "\nEmail Address: " + email + "\nID: " + id;
    }



