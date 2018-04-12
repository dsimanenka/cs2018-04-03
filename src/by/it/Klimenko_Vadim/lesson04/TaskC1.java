package by.it.Klimenko_Vadim.lesson04;

/*
Напишите программу которая спрашивает у пользователя:
Какую вы хотите зарплату в $$$?

После ввода суммы, программа анализирует полученное значение
и если введенная цифра меньше 300 или больше 3000 программа выводит на экран:
Мы вам перезвоним!

Иначе выводит в цикле по переменной int month от 0 до 14 рассчитанную зарплату.
В летние месяцы - выводится введенная сумма с названием месяца.
В несуществующие месяцы 0, 13 и 14 выводится сумма в $0.0
в остальные месяцы выводится указанная сумма с премией в 50%.

Сделайте так, чтобы в тот месяц, когда получилась зарплата в $666 цикл после вывода прерывался.

Пример работы программы (у вас должно быть так же, до символа):

Какую вы хотите зарплату в $$$?
2000
За месяц 0 начислено $0.0
За январь начислено $3000.0
За февраль начислено $3000.0
За март начислено $3000.0
За апрель начислено $3000.0
За май начислено $3000.0
За июнь начислено $2000.0
За июль начислено $2000.0
За август начислено $2000.0
За сентябрь начислено $3000.0
За октябрь начислено $3000.0
За ноябрь начислено $3000.0
За декабрь начислено $3000.0
За месяц 13 начислено $0.0
За месяц 14 начислено $0.0

*/


import java.util.Scanner;
public class TaskC1 {
    public static void main(String[] args) {
        System.out.println("Какую вы хотите зарплату в $$$? ");
        Scanner scanner = new Scanner(System.in);
        int salary = scanner.nextInt();
        if (salary >= 300 && salary <= 3000) {
            for (int month = 0; month <= 14; month++) {
                String month_name;
                double month_salary;
                switch (month) {
                    case 1:
                        month_name = "январь";
                        break;
                    case 2:
                        month_name = "февраль";
                        break;
                    case 3:
                        month_name = "март";
                        break;
                    case 4:
                        month_name = "апрель";
                        break;
                    case 5:
                        month_name = "май";
                        break;
                    case 6:
                        month_name = "июнь";
                        break;
                    case 7:
                        month_name = "июль";
                        break;
                    case 8:
                        month_name = "август";
                        break;
                    case 9:
                        month_name = "сентябрь";
                        break;
                    case 10:
                        month_name = "октябрь";
                        break;
                    case 11:
                        month_name = "ноябрь";
                        break;
                    case 12:
                        month_name = "декабрь";
                        break;
                    default:
                        month_name = "месяц " + month;
                }
                month_salary = salary;
                if (month==0 || month>12) {
                    month_salary=0.0;
                } else if (month<6 || month>8) {
                    month_salary*=1.5;
                }
                System.out.println("За " + month_name + " начислено $" + month_salary);
                if (month_salary==666.0) break;
            }
        } else {
            System.out.println("Мы вам перезвоним!");
        }
    }

}
