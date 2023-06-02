public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма кредита 1 млн рублей / Процентная ставка 9,99% / Срок кредита 12 мес");
        System.out.println("Ежемесячный платеж равен " + service.calculate(1_000_000, 9.99, 12));
        System.out.println();

        System.out.println("Сумма кредита 1 млн рублей / Процентная ставка 9,99% / Срок кредита 24 мес");
        System.out.println("Ежемесячный платеж равен " + service.calculate(1_000_000, 9.99, 24));
        System.out.println();

        System.out.println("Сумма кредита 1 млн рублей / Процентная ставка 9,99% / Срок кредита 36 мес");
        System.out.println("Ежемесячный платеж равен " + service.calculate(1_000_000, 9.99, 36));
        System.out.println();


    }
}
