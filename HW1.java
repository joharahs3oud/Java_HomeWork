public class GradeBook{
// instance variable
  private String courseName;
// instance variable
  private int grades[][]; 
 
public GradeBook( String name, int gradesArray[][] )
 {
// first instance variable 
 courseName = name; 

// second instance variable  
 grades = gradesArray; 
 } 
// set function to set or store  the private variable from another class
public void setCourseName( String name )
 {
// store the value
courseName = name;
 } 
// get function to return  the private variable from another class
public String getCourseName()
{
// return the value
return courseName;
} 


public void processGrades()
{
outputGrades();

System.out.printf("\n\n ",
"Lowest grade in the grade book is", getMinimum(),
"Highest grade in the grade book is", getMaximum() );

outputBarChart();
} 

public int getMinimum()
{
 int lowGrade = grades[ 0 ][ 0 ];

 for ( int studentGrades[] : grades ) 
{ 
 for ( int grade : studentGrades ) 
 { 
 if ( grade < lowGrade ) 
 lowGrade = grade; 
 }  
} 

return lowGrade; 
} 

public int getMaximum()
{
int highGrade = grades[ 0 ][ 0 ];

for ( int studentGrades[] : grades )
{
for ( int grade : studentGrades )
{
if ( grade > highGrade )
highGrade = grade;
} 
} 

return highGrade; 
} 

public double getAverage( int setOfGrades[] ) 
{ 
 int total = 0;  
 
 for ( int grade : setOfGrades ) 
 total += grade; 
 
 return (double) total / setOfGrades.length; 
} 

public void outputBarChart()
{
System.out.println( "total grade distribution:" );

int frequency[] = new int [ 11 ];

for ( int studentGrades[] : grades ) 
{ 
 for ( int grade : studentGrades ) 
 ++frequency[ grade / 10 ]; 
} 
for ( int count = 0; count < frequency.length; count++ )
{
if ( count == 10 )
System.out.printf( "%5d: ", 100 );
else
System.out.printf( "%02d-%02d: ",
count * 10, count * 10 + 9 );

for ( int stars = 0; stars < frequency[ count ]; stars++ )
System.out.print( "*" );

System.out.println(); 
} 
} 

public void outputGrades()
{
System.out.println( "The grades are:\n" );
System.out.print( " " ); 

for ( int test = 0; test < grades[ 0 ].length; test++ )
System.out.printf( "Test %d ", test + 1 );

System.out.println( "Average" ); 

for ( int student = 0; student < grades.length; student++ )
{
System.out.printf( "Student %2d", student + 1 );

for ( int test : grades[ student ] ) 
System.out.printf( "%8d", test );


double average = getAverage( grades[ student ] );
System.out.printf( "%9.2f\n", average );
} 
} 
} 
public class GradeBookTest
 {
 public static void main( String args[] )
 {
int gradesArray[][] = { { 87, 96, 70 }, 
 { 68, 44, 90 }, 
 { 55, 100, 80 }, 
 { 100, 98, 82 }, 
 { 83, 99, 85 }, 
 { 78, 87, 65 }, 
 { 85, 75, 83 }, 
 { 91, 94, 89 }, 
 { 76, 65, 84 }, 
 { 87, 93, 73 } }; 

GradeBook StudentGradeBook = new GradeBook(
"CS101 Introduction to Java Programming", gradesArray );
system.out.println("welcome with the grade book for /n%s/n/n", StudentGradeBook.getCourseName());
StudentGradeBook.processGrades();
} 
} 
// In the above code,I have created instance variables.named grades and course name
