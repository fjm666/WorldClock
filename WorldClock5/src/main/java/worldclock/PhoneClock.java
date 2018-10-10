package worldclock;

/**
 * @author 56324
 */
public class PhoneClock extends Clock{

    private int time;
    private HotelWorldClockSystem hwcs;

    public PhoneClock (int utcOffset){

        super.utcOffset = utcOffset;
    }

    public void setTime(int time){

        this.time = time;
        if(this.hwcs == null){
            return;
        }
        for(CityClock cityClock : this.hwcs.getClocks()){
            cityClock.setUtcZeroTime((this.time - super.utcOffset+24)%24);
        }
    }

    public void setHotelWorldClockSystem(HotelWorldClockSystem hwcs){

        this.hwcs = hwcs;
    }

    @Override
    public int getTime(){

        return this.time;
    }
}
