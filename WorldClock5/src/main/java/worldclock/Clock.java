package worldclock;

/**
 * @author 56324
 */
public abstract class Clock {

     protected int utcOffset;

     /**
      *Returns accurate time of the city.
      *
      * @return time
      */

     public abstract int getTime();
}
