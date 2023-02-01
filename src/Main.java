public class Main {
    public static void main(String[] args) {
        int balance = 100;  //Стартовая сумма на счету.
        int added = 1100;  //Сумма пополнения.
        int bonus = 0;
        bonus = added / 100;
        int total = balance + added + bonus;
        System.out.println("Итоговая сумма на счету клиента:" + total + "рублей.");
        System.out.println("Кол-во бонусов: " + bonus);
    }
}