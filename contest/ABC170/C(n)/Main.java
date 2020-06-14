import java.util.*;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int x = sc.nextInt();
    int n = sc.nextInt();
    int p[] = new int[n];
    int count = 1;
    int countx = 0;
    for (int i = 0; i < n; i++) {
      p[i] = sc.nextInt();
    }
    for (int i = 0; i < n + 1; i++) {
      if (p[i] != x) {
        System.out.println(x);
        count++;
      } else if (i == n) {
        if (count > 0) {
        }
      } else {
        while (p[i] == x) {
          if (p[i] != x - count && p[i] != x + count) {
            System.out.println(x - count);
            break;
          } else if (p[i] != x - count) {
            System.out.println(x - count);
            break;
          } else if (p[i] != x + count) {
            System.out.println(x + count);
            break;
          }
          count++;
        }
      }
    }
  }
}