
public class Main {

  public static void main(String[] args) {

    System.out.println(isLeapYear(2022));
    System.out.println(isLeapYear(2024));
    System.out.println(isLeapYear(1900));
    System.out.println(isLeapYear(2000));
  }// end of maina

  public static boolean isLeapYear(int a) {
  boolean isLeapYear = false;
  
if ((a % 4 == 0) && ((a % 100 != 0 ) || (a % 400 == 0 ))) 
{
  isLeapYear = true; 
}
else 
{
  isLeapYear = false;
}
  return isLeapYear;
  }//end of method
}//end of program
