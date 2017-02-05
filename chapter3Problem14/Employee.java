//This is the Employee class.
package chapter3Problem14;

public class Employee {
    
    private String firstName, lastName;
    private double monthlyPay;
    
    public Employee(String dummyFirst,
            String dummyLast,
            double dummyPay){
        firstName=dummyFirst;
        lastName=dummyLast;
        if(dummyPay > 0){
            monthlyPay=dummyPay;
        } else{monthlyPay=0;}
    }
    
    public void setFirst(String dummy){
        firstName=dummy;
    }
    public String getFirst(){
        return firstName;
    }
    
    public void setLast(String dummy){
        lastName=dummy;
    }
    public String getLast(){
        return lastName;
    }
    
    public void setPay(double dummy){
        if(dummy > 0){
            monthlyPay=dummy;
        } else{monthlyPay=0;}
    }
    public double getPay(){
        return monthlyPay;
    }
    
    public void myDisplay(){
        System.out.printf("%s %s.\n"
                + "Monthly Salary: $%,.2f\n"
                + "Yearly Salary: $%,.2f\n"
                + "10%% raise: $%,.2f\n",
                firstName,
                lastName,
                monthlyPay,
                12*monthlyPay,
                1.1*12*monthlyPay);
    }
    
}