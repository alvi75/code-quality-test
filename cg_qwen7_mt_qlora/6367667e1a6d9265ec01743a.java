import java.util.*;

public class Generated_6367667e1a6d9265ec01743a {
    /**Check whether lastwrite is - 1. If yes, return - 1. Otherwise, return System.currentTimeMillis().**/
    public long lastWriteTimeStampInMilliseconds(){
        if(lastWrite == -1){
            return -1;
        }
        else{
            return System.currentTimeMillis();
        }
    }
}