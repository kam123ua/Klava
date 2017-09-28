package setting;

import klava.Metod;
import klava.TestController;

/**
 *
 * @author kam123ua
 */
public class Time implements Runnable{
    
    public double stopTime;
    
    public Time(double stopTime) {
        this.stopTime = stopTime;
    }
    
    @Override
    public void run() {
        double time = 0;
        while(time < stopTime) { 
            time = Metod.time();
        }
        TestController.status = false;
    }
    
}
