//Here, we test the GradeBook class.
package chapter3Figure8;

import java.util.Scanner;

public class GradeBookTest {
    
    public static void main( String args[] ){
        
        Scanner input = new Scanner( System.in );
        
        GradeBook myGradeBook = new GradeBook();
        
        System.out.printf( "Initial course name is: %s\n\n",
                myGradeBook.getCourseName() );
        
        System.out.printf( "Please enter the course name:\n" );
        
        String theName = input.nextLine();
        
        myGradeBook.setCourseName( theName );
        
        System.out.printf("\n");
        
        myGradeBook.displayMessage();
        
    }
    
}
