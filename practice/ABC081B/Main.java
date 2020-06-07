import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] =sc.nextInt();
            if(a[i]%2==0){
                x++;
            }
        }
        if(x==n){
            int min = Integer.MAX_VALUE;
            for(int y=0;y<n;y++){
                int count = 0;
                while(a[y]%2==0){
                    a[y] /= 2;
                    count++;
                }
                min = Math.min(min, count);
            }
            System.out.println(min);
        }else{
            System.out.println(0);
        }
    }
}