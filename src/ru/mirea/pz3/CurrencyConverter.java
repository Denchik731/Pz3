package ru.mirea.pz3;

public class CurrencyConverter {
    private double exchangeRate; // Переменная для хранения курса обмена

    // Конструктор класса, принимает курс обмена и инициализирует поле exchangeRate
    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    // Метод для конвертации суммы из одной валюты в другую
    public double convert(double amount) {
        return amount * exchangeRate;
    }

    public static void main(String[] args) {
        // Установливаю курс обмена (пример: 1 USD = 0.85 EUR)
        double exchangeRateUSDToEUR = 0.85;

        // Создаю конвертор с заданным курсом обмена
        CurrencyConverter converter = new CurrencyConverter(exchangeRateUSDToEUR);

        // Сумма в исходной валюте (USD)
        double amountInUSD = 100.0;

        // Конвертируйте сумму в другую валюту (EUR)
        double amountInEUR = converter.convert(amountInUSD);

        // Вывод результата
        System.out.println(amountInUSD + " USD = " + amountInEUR + " EUR");
    }
}