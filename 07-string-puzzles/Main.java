
  
class Main {
  public static void main(String[] args) {
    
    System.out.println(concatenation("catat", "tat"));//need help to fix 
    System.out.println(repeatEnd("Hello",3));
    System.out.println(countHi("hi"));
  }//end of main







public static String concatenation (String a, String b)
  {
    String New = "";
   
    String end = a.substring(a.length()-1);
    String start = b.substring(0,1);
    System.out.println(end);
    
    
    if (end.equals(start))//.equals
    {
      New = a + b.substring(1);
   
    }
    else 
      New = a+b; 
    
return New;
  
}//end of concatenation method



  

public static String repeatEnd(String word, int num)
  {
    String output = "";
    int amount = (word.length()-num);
   
    
    for ( int i = 0;  i < num; i++)
      {
         output += word.substring(amount);
      }

    return output;
  }//end of repeat end





public static int countHi(String str) 
  {
    int count =0;
    for (int i = 0; i <=str.length() -2; i++)
      {
        if (str.substring (i,i+2).equals("hi"))
        {
          count++;
        }
      }
    return count;
  }





  
}//end of main

