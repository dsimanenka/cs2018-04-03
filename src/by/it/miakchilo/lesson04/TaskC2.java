package by.it.miakchilo.lesson04;

import java.util.Scanner;

/*

На входе вводится число и месяц 2018 года.
Программа должна выводить номер дня года, считая 1 января первым днем,
а 31 декабря 365-м.

Пример:
Ввод:
1 1

Вывод
1

Ввод:
31 12

Вывод
365

Ввод:
13 9

Вывод
256

 */
public class TaskC2 {
    public static void main(String[] args) {
        System.out.print("Введите число и месяц 2018 года через пробел, нажмите [Enter]: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        if (day<=0) day=1;
        else if (day>31) day=12;

        int month = scanner.nextInt();
        if (month<=0) month=1;
        else if (month>12) month=12;

        int sum_days=0;
        for (int i=1; i<month; i++){
            switch(i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    sum_days+=31;
                    break;
                case 2:
                    sum_days+=28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    sum_days+=30;
            }
        }
        System.out.println(sum_days+day);
    }
}
