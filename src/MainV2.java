public class MainV2 {
    public static void main(String[] args) {
        int addMoney = 1100;
        int balance = 100 + addMoney;
        int bonus = balance / 1000;
        if (balance > 1000)
            System.out.println("Поздравляем вам начислены бонусы в размере:" + bonus + "балл");
        else {
            System.out.println("Пополнен баланс на сумму:" + addMoney + "рублей");

        }
    }
}