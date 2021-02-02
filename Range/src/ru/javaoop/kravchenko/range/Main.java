package ru.javaoop.kravchenko.range;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(1.4, 4.7);

        range1.print();
        System.out.printf("Длина первого отрезка = %.2f%n", range1.getLength());
        double number1 = 3.3;
        System.out.printf("Число %.2f входит в диапазон между %.2f и %.2f? = %b%n", number1, range1.getFrom(), range1.getTo(), range1.isInside(number1));

        System.out.println();

        Range range2 = new Range(1.7, 8.1);

        range2.print();
        System.out.printf("Длина второго отрезка = %.2f%n", range2.getLength());
        double number2 = 9.1;
        System.out.printf("Число %.2f входит в диапазон между %.2f и %.2f? = %b%n", number2, range2.getFrom(), range2.getTo(), range2.isInside(number2));

        System.out.println();

        Range range3 = new Range(9.2, 22.1);

        range3.print();
        System.out.printf("Длина третьего отрезка = %.2f%n", range3.getLength());
        range3.setFrom(9.1);
        range3.setTo(17.9);
        System.out.println("После установки новых значений От и До:");
        range3.print();
        System.out.printf("Длина третьего отрезка = %.2f%n", range3.getLength());
        double number3 = 9.11;
        System.out.printf("Число %.2f входит в диапазон между %.2f и %.2f? = %b%n", number3, range3.getFrom(), range3.getTo(), range3.isInside(number3));
    }
}