//This is the Date class.
package chapter3Problem15;

public class Date {
    
    private int month, day, year;
    
    public Date(int dummyMonth,
            int dummyDay,
            int dummyYear){
        month=dummyMonth;
        day=dummyDay;
        year=dummyYear;
    }
    
    public void setMonth(int dummy){
        month=dummy;
    }
    public int getMonth(){
        return month;
    }
    
    public void setDay(int dummy){
        day=dummy;
    }
    public int getDay(){
        return day;
    }
    
    public void setYear(int dummy){
        year=dummy;
    }
    public int getYear(){
        return year;
    }
    
    public void displayDate(){
        System.out.printf(
                "%02d/%02d/%04d",
                month, day, year);
    }
    
}