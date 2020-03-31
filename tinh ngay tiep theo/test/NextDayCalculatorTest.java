import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void nextDay() {
        String expected = "ngay 2 thang 1 nam 2018";
        String result = NextDayCalculator.nextDay(1, 1, 2018);
        assertEquals(expected,result);
    }
    @Test
    void nextMonth() {
        String expected = "ngay 1 thang 2 nam 2018";
        String result = NextDayCalculator.nextDay(31, 1, 2018);
        assertEquals(expected,result);
    }


    @Test
    void testdayOfMonth() {
        int expected = 31;
        int result = NextDayCalculator.dayOfMonth(1,2020);

    }

    @Test
    void nextMonth2() {
        String expected = "ngay 1 thang 5 nam 2018";
        String result = NextDayCalculator.nextDay(30, 4, 2018);
        assertEquals(expected,result);
    }
    @Test
    void nextMonth3() {
        String expected = "ngay 1 thang 3 nam 2018";
        String result = NextDayCalculator.nextDay(28, 2, 2018);
        assertEquals(expected,result);
    }
    @Test
    void nextMonth4() {
        String expected = "ngay 1 thang 3 nam 2020";
        String result = NextDayCalculator.nextDay(29, 2, 2020);
        assertEquals(expected,result);
    }
    @Test
    void nextYear() {
        String expected = "ngay 1 thang 1 nam 2019";
        String result = NextDayCalculator.nextDay(31, 12, 2018);
        assertEquals(expected,result);
    }
}