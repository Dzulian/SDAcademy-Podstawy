package homeworks;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateExample {
    public static void main(String[] args) {

        System.out.println("Waloryzacja argumentów z tabeli:");
        String[] Localdateexample = new String[]{
                "2023-01-01",
                "1992-09-21",
                "przedsiębiorstwo",
                "3,14",
                "1914-07-14",
                "1789-07-14",
                "-13.mm.rr",
                "0 17 0 17."
        };

        for (String example : Localdateexample) {
            boolean match = example.matches("^[0-9]{4}-[0-9]{2}-[0-9]{2}$");
            System.out.printf("%s: %b\n", example, match);

            if (match) {
                LocalDate date = LocalDate.parse(example);
                System.out.println("; us date: " + LocalDate.now());
            }
        }

        { //Tutaj kombinowałem z okresami, ale nie wiedziałem jak zczytać dane z tabeli i wpisałem poniższe daty ręcznie
            System.out.println("---------------------------------------------------------");
            System.out.println("Przedział czasowy właściwych dat przed ustalonym okresem :");

            Period period = Period.ofMonths(2);
            System.out.println(period);

            LocalDate date1 = LocalDate.of(2023, 1, 1);
            LocalDate date1BeforePeriod = date1.minus(period);
            System.out.println("Czas przed okresem: " + date1BeforePeriod);

            LocalDate date2 = LocalDate.of(1992, 9, 21);
            LocalDate date2BeforePeriod = date2.minus(period);
            System.out.println("Czas przed okresem:  " + date2BeforePeriod);

            LocalDate date3 = LocalDate.of(1914, 7, 14);
            LocalDate date3BeforePeriod = date3.minus(period);
            System.out.println("Czas przed okresem: " + date3BeforePeriod);

            LocalDate date4 = LocalDate.of(1789, 7, 14);
            LocalDate date4BeforePeriod = date4.minus(period);
            System.out.println("Czas przed okresem: " + date4BeforePeriod);

            System.out.println("------------------------------------------------------");
            System.out.println("Przedział czasowy właściwych dat po ustalonym okresie:");
            LocalDate dateAfterPeriod = date1.plus(period);
            System.out.println("Czas po okresie:" + dateAfterPeriod);

            LocalDate date2AfterPeriod = date2.plus(period);
            System.out.println("Czas po okresie:" + date2AfterPeriod);

            LocalDate date3AfterPeriod = date3.plus(period);
            System.out.println("Czas po okresie:" + date3AfterPeriod);

            LocalDate date4AfterPeriod = date4.plus(period);
            System.out.println("Czas po okresie:" + date4AfterPeriod);
        }
    }
}