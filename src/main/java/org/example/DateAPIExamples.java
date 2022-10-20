package org.example;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class DateAPIExamples {

    public static void main(String[] args) {

        System.out.println("Java 8 Features >> Date API Usage");
        System.out.println("---------------------------------");

        System.out.println();
        System.out.println("Date Related: ");
        System.out.println("------------");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        LocalDate date2 = LocalDate.of(2020, 03, 18);
        System.out.println(date2);
        LocalDate date3 = LocalDate.parse("2022-10-20");
        System.out.println(date3);
        LocalDate date4 = date3.plusDays(2).minus(2, ChronoUnit.MONTHS);
        System.out.println("2022-10-20 before 2 months and after 2 days: "+date4);

        DayOfWeek day = date4.getDayOfWeek();
        System.out.println("Day of Week: "+day);

        int dayOfMonth = date4.getDayOfMonth();
        System.out.println("Day of Month: "+dayOfMonth);

        boolean isLeapYear = LocalDate.now().isLeapYear();
        System.out.println("Is current date is in leap year: " + isLeapYear);

        boolean isDateBefore = LocalDate.of(2022, 11, 20).isBefore(date4);
        System.out.println("Is 2022-11-20 before 2022-08-22: "+isDateBefore);
        boolean isDateAfter = LocalDate.of(2022, 11, 20).isAfter(date4);
        System.out.println("Is 2022-11-20 after 2022-08-22: "+isDateAfter);

        LocalDateTime startOfDay = LocalDate.parse("2022-08-22").atStartOfDay();
        System.out.println("Start of day 2022-08-22: " + startOfDay);

        LocalDate startOfMonth = LocalDate.parse("2022-08-22").with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of month of 2022-08-22: " + startOfMonth);

        System.out.println();
        System.out.println("Time Related: ");
        System.out.println("-------------");

        LocalTime time1 = LocalTime.now();
        System.out.println("time now: " + time1);
        LocalTime time2 = LocalTime.of(6, 30);
        System.out.println("six thirty: " + time2);
        LocalTime time3 = LocalTime.parse("07:30");
        System.out.println("seven thirty: " + time3);

        LocalTime time4 = time3.plus(1, ChronoUnit.HOURS);
        System.out.println("time after 1 hour: " + time4);

        int hour = time4.getHour();
        System.out.println("hour: " + hour);

        boolean isTimeBefore = LocalTime.of(07, 30).isBefore(LocalTime.parse("08:30"));
        System.out.println("is 07:30 before 08:30: " + isTimeBefore);

        System.out.println("Max time: " + LocalTime.MAX);

        System.out.println();
        System.out.println("Date Time Related: ");
        System.out.println("------------------");

        LocalDateTime dateTime1 = LocalDateTime.now();
        System.out.println("current date time: " + dateTime1);
        LocalDateTime dateTime2 = LocalDateTime.of(2018, Month.APRIL, 20, 8, 40);
        System.out.println(dateTime2);
        LocalDateTime dateTime3 = LocalDateTime.parse("2022-03-20T07:40:00");
        System.out.println(dateTime3);

        LocalDateTime dateTime4 = dateTime3.plusDays(7).minusHours(3);
        System.out.printf("calculated date: " + dateTime4);

        System.out.println("Month: " + dateTime4.getMonth());

        Set<String> getAllZonedIds = ZoneId.getAvailableZoneIds();
        System.out.println(getAllZonedIds);
        ZoneId zoneId = ZoneId.of("Europe/Paris");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime4, zoneId);
        System.out.println(zonedDateTime);

        ZoneOffset offset = ZoneOffset.of("+04:00");
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime4, offset);
        System.out.println(offsetDateTime);

        System.out.println("Period is measured in day, month, year");

        LocalDate startDate = LocalDate.now();
        LocalDate finalDate = startDate.plus(Period.ofDays(7));
        int difference1 = Period.between(startDate, finalDate).getDays();
        System.out.println(difference1);
        long difference2 = ChronoUnit.DAYS.between(startDate, finalDate);
        System.out.println(difference2);

        System.out.println("Duration is measured in seconds and milliseconds");

        LocalTime startTime = LocalTime.now();
        LocalTime finalTime = startTime.plus(Duration.ofSeconds(40));
        long difference3 = Duration.between(startTime, finalTime).getSeconds();
        System.out.println(difference3);
        long difference4 = ChronoUnit.SECONDS.between(startTime, finalTime);
        System.out.println(difference4);

        System.out.println();
        System.out.println("Convert from old Date and Calendar instances: ");
        System.out.println("---------------------------------------------");

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        LocalDateTime currentDate = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println("current date from old Date: "+currentDate);
        LocalDateTime curCalendarDate = LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
        System.out.println("current date from old calendar: "+curCalendarDate);

    }

}
