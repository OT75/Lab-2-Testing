

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class Q3Test
{
    Q3 x;

    @BeforeEach

    public void init()
    {
        x=new Q3();
    }
    @Nested
    public class Check
    {
        @Test
        public void TimeToDate()
        {

            x.Clicking('a');
            assertEquals("NORMAL,DATE",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        @Test
        public void DateToTime()
        {
            x.Clicking('a');
            x.Clicking('a');
            assertEquals("NORMAL,TIME",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        @Test
        public void NormalToUpdate()
        {
            x.Clicking('c');
            assertEquals("UPDATE,min",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        @Test
        public void NormalToAlarm()
        {
            x.Clicking('b');
            assertEquals("ALARM,Alarm",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        /*
        ------------------------------------------------------------
                              Update State
        ------------------------------------------------------------
         */
        @Test
        public void minTomin()
        {
            x.Clicking('c');
            x.Clicking('b');
            assertEquals("UPDATE,min",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:1", x.getTime());

        }
        @Test
        public void minToHour_HourToHour()
        {
            x.Clicking('c');
            x.Clicking('a');
            assertEquals("UPDATE,hour",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
            x.Clicking('b');
            assertEquals("UPDATE,hour",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("1:0", x.getTime());

        }
        @Test

        public void hourToDay_DayToDay()
        {
            x.Clicking('c');
            x.Clicking('a');
            x.Clicking('a');
            assertEquals("UPDATE,day",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
            x.Clicking('b');
            assertEquals("UPDATE,day",x.getState());
            assertEquals("2000-1-2", x.getDate());
            assertEquals("0:0", x.getTime());

        }
        @Test
        public void dayToMonth_MonthToMonth()
        {
            x.Clicking('c');
            x.Clicking('a');
            x.Clicking('a');
            x.Clicking('a');
            assertEquals("UPDATE,month",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
            x.Clicking('b');
            assertEquals("UPDATE,month",x.getState());
            assertEquals("2000-2-1", x.getDate());
            assertEquals("0:0", x.getTime());

        }
        @Test
        public void monthToYear_YearToYear()
        {

            x.Clicking('c');
            x.Clicking('a');
            x.Clicking('a');
            x.Clicking('a');
            x.Clicking('a');
            assertEquals("UPDATE,year",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
            x.Clicking('b');
            assertEquals("UPDATE,year",x.getState());
            assertEquals("2001-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        @Test
        public void yearToNormal()
        {
            x.Clicking('c');
            x.Clicking('a');
            x.Clicking('a');
            x.Clicking('a');
            x.Clicking('a');
            x.Clicking('a');
            assertEquals("NORMAL,TIME",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());
        }
        /*
        ------------------------------------------------------------
                              ADUP
        ------------------------------------------------------------
         */
        @Test
        public void ADUP1()
        {
            x.Clicking('c');
            assertEquals("UPDATE,min",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:0", x.getTime());

        }
        @Test
        public void ADUP2()
        {
            x.Clicking('c');
            x.Clicking('b');
            assertEquals("UPDATE,min",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:1", x.getTime());


        }
        @Test
        public void ADUP3()
        {
            x.Clicking('c');
            x.Clicking('b');
            x.Clicking('b');
            assertEquals("UPDATE,min",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:2", x.getTime());


        }
        @Test
        public void ADUP4()
        {
            x.Clicking('c');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            assertEquals("UPDATE,hour",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("0:2", x.getTime());


        }
        @Test
        public void ADUP5()
        {
            x.Clicking('c');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            assertEquals("UPDATE,hour",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("1:2", x.getTime());


        }
        @Test
        public void ADUP6(){
            x.Clicking('c');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            assertEquals("UPDATE,hour",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP7()
        {
            x.Clicking('c');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            assertEquals("UPDATE,day",x.getState());
            assertEquals("2000-1-1", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP8()
        {
            x.Clicking('c');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            assertEquals("UPDATE,day",x.getState());
            assertEquals("2000-1-2", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP9()
        {
            x.Clicking('c');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            assertEquals("UPDATE,day",x.getState());
            assertEquals("2000-1-3", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP10()
        {
            x.Clicking('c');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            assertEquals("UPDATE,month",x.getState());
            assertEquals("2000-1-3", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP11()
        {
            x.Clicking('c');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            assertEquals("UPDATE,month",x.getState());
            assertEquals("2000-2-3", x.getDate());
            assertEquals("2:2", x.getTime());

        }
        @Test
        public void ADUP12()
        {
            x.Clicking('c');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            x.Clicking('a');
            x.Clicking('b');
            x.Clicking('b');
            assertEquals("UPDATE,month",x.getState());
            assertEquals("2000-3-3", x.getDate());
            assertEquals("2:2", x.getTime());

        }

    }
    @AfterEach
    public void cleanUp()
    {
        x=null;
    }

}
