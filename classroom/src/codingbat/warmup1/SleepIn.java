package codingbat.warmup1;

public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        /*or truth table
        * 0  0  0
        1  0   1
        0  1   1
        1  1   1
        */
        if(!weekday ||  vacation){
            return true;
        }
        else{
            return false;
        }
  
    }




}