import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Balanceclient = 100;
        Scanner scan = new Scanner(System.in);
        System.out.print("Пополнение счета: ");
        double income = scan.nextDouble();
        int bonus;
        if (income > 1000) {
            bonus = (int) income / 100;
        } else {
            bonus = 0;
        }

        Balanceclient += income + bonus;

        System.out.print("Бонус: ");
        System.out.println(bonus);
        System.out.print("Баланс: ");
        System.out.println(Balanceclient);
    }

}