import java.util.*;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String a = sc.nextLine();
    int len = a.length();
    char x = a.charAt(len);
    // try{
    // int y = Integer.parseInt(x);
    // }catch(NumberFormatException e){
    // System.exit(0);
    // }
    if (x == 3) {
      System.out.println("bon");
    } else if (x == 0 || x == 1 || x == 6 || x == 8) {
      System.out.println("pon");
    } else {
      System.out.println("hon");
    }
  }
}