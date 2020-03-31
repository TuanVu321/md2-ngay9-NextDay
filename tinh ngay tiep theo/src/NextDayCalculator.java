public class NextDayCalculator {

    public static String nextDay(int day, int month, int year) {
        if (month >= 1 && month <= 12) {
            if (month == 12 && day == dayOfMonth(month, year)) {
                return yearNext(year);
            } else {
                if (day == dayOfMonth(month, year)) {
                    return monthNext(month, year);
                } else {
                    return dayNext(day, month, year);
                }
            }
        }
        return "Khong phai la ngay thang nam";
    }

    private static String yearNext(int year) {
        int day;
        int month;
        return "ngay " + (day = 1) + " thang " + (month = 1) + " nam " + (++year);
    }

    private static String monthNext(int month, int year) {
        int day;
        return "ngay " + (day = 1) + " thang " + (++month) + " nam " + (year);
    }

    private static String dayNext(int day, int month, int year) {
        return "ngay " + (++day) + " thang " + (month) + " nam " + (year);
    }

    public static int dayOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return dayOfMonth2(year);
            default:
                return 30;
        }
    }

    private static int dayOfMonth2(int year) {
        if (isLeapYear(year)) {
            return 29;
        } else {
            return 28;
        }
    }

    public static boolean isLeapYear(int year) {
        boolean isDivisionBy400 = (year % 400 == 0);
        boolean isGreaterThan0 = (year >= 0);
        boolean isDivisionBy4 = (year % 4 == 0);
        boolean isNotDivisionBy100 = (year % 100 != 0);

        if (isGreaterThan0) {
            if (isDivisionBy400)
                return true;
            else if (isDivisionBy4 && isNotDivisionBy100)
                return true;
        }
        return false;
    }
}
