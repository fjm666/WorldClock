package worldclock;

import java.util.ArrayList;

/**
 * @author 56324
 */
public class HotelWorldClockSystem {

    protected ArrayList<CityClock>cityClock = new ArrayList<CityClock>();

    public void attach( CityClock cityClock){

        this.cityClock.add(cityClock);
    }

    public ArrayList<CityClock> getClocks(){

        return this.cityClock;
    }

}
