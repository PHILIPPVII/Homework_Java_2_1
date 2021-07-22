public class MainV2 {
    public static void main(String[] args) {
        int Add_Money = 1100;
        int Balance = 100 + Add_Money;
        int Bonus = Balance / 1000;
        if (Balance > 1000)
            System.out.println("Поздравляем вам начислены бонусы в размере:" + Bonus);
        else {
            System.out.println("Пополнен баланс на сумму:" + Add_Money + "рублей");

        }
    }
}