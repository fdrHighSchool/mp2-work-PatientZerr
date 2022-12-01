
class Main {
  public static void main(String[] args) {
    square(5);
    rectangle(2, 4);
    triangle(5);
    triangle2(5);
  }
 
  // rectangle
  public static void rectangle(int width, int length) {
    System.out.println(" ");
    for (int i = 0; i < length; i++) {

      for (int j = 0; j < width; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  // square
  public static void square(int length) {
    System.out.println(" ");
    for (int i = 0; i < length; i++) {

      for (int j = 0; j < length; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }

  // triangle
  public static void triangle(int size) {
    System.out.println(" ");
    
    String star = "";
        for (int j = 0; j < size; j++) {
      star += "* ";
      System.out.println(star);
    }
  }
  
//isocoleces triangle
  public static void triangle2(int size) {
    System.out.println(" ");
    int n = size;
    int i, j;
    for (i = 1; i <= n; i++) {
      for (j = i; j <= n; j++) {
        System.out.print(" ");
      }
      for (j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println("");
    }

  }

}// end of program
