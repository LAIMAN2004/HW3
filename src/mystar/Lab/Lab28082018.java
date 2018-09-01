package mystar.Lab;
import java.util.Scanner;
public class Lab28082018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        int s=1;
        int i = 1;
        System.out.println("Введи число - ");
        m = scanner.nextInt();
        System.out.println("Введи степень числа - ");
        n = scanner.nextInt();
        while (i <= n) {
            s = s * m;
            i++;
        }
        System.out.println("итог = " + s);
    }
}



        /* пример факториала через вайл
        int n;
        int f = 1;
        int i=1;
        n = scanner.nextInt();
        while (i <= n) {
            f = f * i;

            i++;
        }System.out.println("Факториал равен - " + f);
    }
}

*/

     /* задание 1 через while------------------------------------
        int i = 1;
        while (i < 100) {
            if (i % 2 != 0)
                System.out.println("И равна = " + i);
            i++;
        }
    }
}
---------------------*/







        /*-----------------------------------
        задание 2
        Scanner scanner = new Scanner(System.in);
        int n;
        int f = 1;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            f = f * i;
            System.out.println("Факториал равен - " + f);
        }
        System.out.println("Факториал равен - " + f);
    }}    */

// пример 2 использования do {} while ()
/*--------------------------------------
Scanner scanner = new Scanner(System.in);
      int result=25;
      do {
          System.out.println("введи число 25");
            result = scanner.nextInt();
            if (result==25){                                  // если написать true вместо (result != 25), то цикл быдет бесконечным,
                break;                                        // поэтому дописываем перед этим if (result==25); {break;}
            }}
        while (true);
            System.out.println("Вы угадали");}}     */


// программа 1

        /* ---------------------------
        int j;
        for (int i = 1; i < 99; i++) {
            if (i%2!=0) // вывод  i нечетных, тоесть то что после запятой не равно нулю (тоесть чтото есть)после процента (запятой) два символа != неравно
             System.out.println("Первый цикл - " +i);
                          }}}
------------------------------------------*/


// пример 1

         /*------------------------------------
         int i=0;
         System.out.println("Первый цикл" + i);
         while (i<10) {
             System.out.println("И равна = " + i);
             i++;
         }------------------------------------*/


