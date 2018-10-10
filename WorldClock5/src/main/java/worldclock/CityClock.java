package worldclock;

/**
 * @author 56324
 */
public class CityClock extends Clock{

    private int utcZeroTime;

    public CityClock(int utcOffset){

        super.utcOffset = utcOffset;
    }

    @Override
    public int getTime(){

        return (this.utcZeroTime+super.utcOffset+24)%24;
    }

    public void setUtcZeroTime(int utcZeroTime){

        this.utcZeroTime = utcZeroTime;
    }
}
