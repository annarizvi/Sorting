/*

 *  Employee

 *  Represents a person who is an Employee and creates instance variables of
    office, salary, and dateHired

 *

 * CMSC 256 Project 1

 * @author Anna Rizvi

 */

package cmsc256;

//import to use data type LocalDate
import java.time.DateTimeException;
import java.time.LocalDate;

public class Employee extends Person {


    //declare instance variables
    private String office;
    private int salary;
    private LocalDate hireDate;

    //assign default constructors
    public Employee() {
        super(); //calls default constructor in person
        office = "Unassigned";
        salary = 0;
        hireDate = null;
        new Student();
    }

    //parameterized constructor
    public Employee(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year){

        // new Person(first, middle, last, homeAddress, phoneNumber, email);

        super(first, middle, last, homeAddress, phoneNumber, email);  // calls the parameterized constructor in Person

        if(salary < 0) {
            throw new IllegalArgumentException();
        }


        this.office = office; //adds office

        this.salary = salary; //adds salary

        this.hireDate = LocalDate.of(year, month, day);

    }
    /*public Employee(String first, String middle, String last, Address homeAddress, String phoneNumber, String email, String office, int salary, int month, int day, int year){
        super(first, middle, last, homeAddress, phoneNumber, email); //calls parameterized constructor in Person
        this.office = office; //adds office
        this.salary = salary; //adds salary
        this.hireDate = LocalDate.of(year, month, day);
    }
*/

    //getters and setters

    //getter office
    public String getOffice() {
        return office;
    }
    //setter office
    public void setOffice(String office) {
        this.office = office;
    }


    //getter salary
    public int getSalary(){
        return salary;
    }
    //setter salary
    public void setSalary(int salary){
        this.salary = salary;
    }


    //getter hireDate
    public LocalDate getHireDate(){
        return hireDate;
    }
    //setter hireDate
    public void setHireDate(LocalDate hireDate){
        this.hireDate = hireDate;
    }

    public String toString(){
        return super.toString() + "Employee: " + "\nOffice: " + office + "\nSalary: " + salary + "\nDate Hired: " + hireDate.toString();
    }





}
