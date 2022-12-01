import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Whats your grade?");
    int x = input.nextInt();
   System.out.println("Your grade is: " + Grade(x));
  }




  public static String Grade (int grade)
  {    String rating ="" ;
   if (grade < 60 )
   {
     rating = ("f"); 
   }
    else if (60<=grade  && grade <= 70)
    {
      rating = ("D");
    }
    else if ( 70<=grade  && grade<= 80)
    {
      rating = ("C");
    }
    else if (80<=grade  && grade <=90)
    {
      rating = ("B");
    }
    else if  (grade > 90 )
   {
     rating = ("A"); 
   }

    
    String a = Integer.toString(grade);
    String b = a.substring(a.length()-1);
    int last = Integer.valueOf(b);

    
    if (last == 7 || last == 8 || last == 9 )
    {
      rating += ("+");
    }
    else if ( last == 0 || last == 1 || last == 2)
    {
      rating += ("-");
    }

  if (grade == 100)
{
  rating = "A   for amazing you you spent your life doing something.";
}
if (grade <=60)
{
  rating = "f--   cmon man do some work you lazy....";
}
    return rating;
  }
    
}
