import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = input.nextInt();
   
    System.out.println(divBy3(number));
    
  }// main

public static boolean divBy3(int number)
  {   
    String stringNum = Integer.toString(number);// finds the length of the number
    int length = stringNum.length(); 
    int intNum;
    int sum = 0;
          
    for (int i =0;   i < length; i++)
    {
      intNum = Integer.valueOf(stringNum.substring(i,i+1)); //finds the individual digits      i is the digit place
      sum += intNum;

    }
    
    return (sum % 3 == 0);
  }




 



  
}
// programa
