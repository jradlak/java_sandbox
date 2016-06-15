package com.jrd.calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by Kuba on 2016-04-26.
 *
 * Rozwiązanie zadania 1 z rozdziału 2.
 * Jest to modyfikacja dołączonego do książki programu wyświetlającego kalendarz.
 * Modyfikacja polega na wyświetlaniu kalenadarza w taki sposób, że za pierwszy dzień tygodnia uważana jest niedziela.
 *
 */
public class Cal {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        int month;
        if (args.length >= 2) {
            month = Integer.parseInt(args[0]);
            int year = Integer.parseInt(args[1]);
            date = LocalDate.of(year, month, 1);
        } else {
            month = date.getMonthValue();
        }

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");
        DayOfWeek weekday = date.getDayOfWeek();
        int value = (weekday.getValue() + 1) % 7; // 1 = Sunday, ... 7 = Saturday
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7) {
                System.out.println();
            }
        }

        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
