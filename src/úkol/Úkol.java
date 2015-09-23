
package úkol;

import java.util.Scanner;

public class Úkol {

  
    public static void main(String[] args) {
         System.out.println("Tento program srovná čísla od největšího po nejmenší");
        System.out.print("Zadej 1. číslo: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
         System.out.println();
        System.out.print("Zadej 2. číslo: ");
        int b = in.nextInt();
         System.out.println();
        System.out.print("Zadej 3. číslo: ");
        int c = in.nextInt();
         System.out.println();
         int x = 0, y = 0, z = 0;
         if ((a>b) && (a>c)) {
             x = a;
             if(b>c) {
                 y = b;
                 z = c;
             }
             else {
                 y = c;
                z = b;
             }
         }
          if ((b>a) && (b>c)) {
              x = b;
             if(a>c) {
                 y = a;
                  z = c;
             }
             else {
                  y = c;
                 z = a;
             }
         }
         if ((c>b) && (c>a)) {
             x = c;
             if(b>a) {
                y = b;
                 z = a;
             }
             else {
                 y = a;
                 z = b;
             }
         }
         System.out.println("Největší číslo je: " + x);
         System.out.println("Prostřední číslo je: " + y);
         System.out.println("Nejmenší číslo je: " + z);
    }
    
}
