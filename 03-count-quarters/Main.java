import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     System.out.println("How much?");
    int x = input.nextInt();
    System.out.println(countQuarters(x));
  }

  public static int countQuarters (int cents)
  {
    String cent = Integer.toString(cents);
    String remain = cent.substring(cent.length()-2);
    int remaining = Integer.valueOf(remain);
    int numberOfQuarters = remaining/25;
    return numberOfQuarters;
  }
}
