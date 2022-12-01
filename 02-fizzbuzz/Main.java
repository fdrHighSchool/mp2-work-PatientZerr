import java.util.Scanner;



class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   System.out.println("Enter a number.");
    int num = input.nextInt();
    System.out.println(fizzBuzz(num));
    
    //input.close;
  }//end of main




  
public static String fizzBuzz(int num)
  {
  String ans = "";
    
  if (num % 3 == 0) {
      ans += ("fizz");
    }
  if (num % 5 == 0) {
      ans +=("buzz");
      }
  if (num % 3 !=0 && num % 5 !=0) {
      ans = String.valueOf(num);
    }
  
    

    return ans;
  }
  

  
}//end of program






  //Scanner input = new Scanner(System.in);
  //  System.out.println("Enter a number.");
    //int num = input.nextInt();
