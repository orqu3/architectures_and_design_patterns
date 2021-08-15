package lesson_4;
/*
 * 1. Реализовать как минимум один структурный паттерн в своем домашнем приложении.
 *
 * Пример с использованием паттерна Адаптер.
 *
 * Основные характеристики:
 *
 * Target Interface - интерфейс, который будет использоваться клиентами (CreditCard);
 *
 * Adapter Class - класс-оболочка, который реализует Target Interface и изменяет конкретный запрос,
 * доступный из класса Adaptee (BankCustomer);
 *
 * Adaptee class - класс, который используется Adapter Class для повторного использования существующих функций и их
 * изменения (BankDetails).
 *
 * Client - класс, который будет взаимодействовать с Adapter class (AdapterPatternExample).
 */

public class AdapterPatternExample {

    public static void main(String[] args) {

        CreditCard creditCard = new BankCustomer();
        creditCard.giveBankDetails();
        System.out.print(creditCard.getCreditCard());

    }
}
