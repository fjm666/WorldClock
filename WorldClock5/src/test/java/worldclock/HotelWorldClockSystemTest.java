package worldclock;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelWorldClockSystemTest {

    private HotelWorldClockSystem hwcs;
    private PhoneClock pc;

    @Before
    public void setUp(){

        this.hwcs = new HotelWorldClockSystem();
        this.pc = new PhoneClock(8);
    }

    @Test
    public void the_time_of_Beijing_should_be_12_after_phone_clock_is_set_to_12(){

        pc.setTime(12);

        assertEquals(12, pc.getTime());
    }

    @Test
    public  void the_time_of_London_should_be_4_after_phone_clock_is_set_to_12(){

        CityClock London = new CityClock(0);
        hwcs.attach(London);

        pc.setHotelWorldClockSystem(hwcs);
        pc.setTime(12);

        assertEquals(4, London.getTime());
    }

    @Test
    public  void the_time_of_Moscow_should_be_8_after_phone_clock_is_set_to_12(){

        CityClock Moscow = new CityClock(4);
        hwcs.attach(Moscow);

        pc.setHotelWorldClockSystem(hwcs);
        pc.setTime(12);

        assertEquals(8, Moscow.getTime());
    }

    @Test
    public  void the_time_of_Sydney_should_be_22_after_phone_clock_is_set_to_12(){

        CityClock Sydney = new CityClock(10);
        hwcs.attach(Sydney);

        pc.setHotelWorldClockSystem(hwcs);
        pc.setTime(12);

        assertEquals(14, Sydney.getTime());
    }

    @Test
    public  void the_time_of_NewYork_should_be_7_after_phone_clock_is_set_to_12(){

        CityClock NewYork = new CityClock(19);
        hwcs.attach(NewYork);

        pc.setHotelWorldClockSystem(hwcs);
        pc.setTime(12);

        assertEquals(23, NewYork.getTime());
    }

}
