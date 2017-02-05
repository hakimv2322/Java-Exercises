//This is the GradeBook class.
package chapter3Figure8;

public class GradeBook {
    
    private String courseName;
    
    public void setCourseName( String name ){
        
        courseName = name;
        
    }
    
    public String getCourseName(){
        
        return courseName;
        
    }
    
    public void displayMessage(){
        
        System.out.println( "Welcome to the grade book for" );
        System.out.printf("%s!",courseName);
        System.out.println();
        
    }
    
}
