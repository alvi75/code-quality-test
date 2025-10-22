import java.util.*;

public class Generated_636767781a6d9265ec018250 {
    public int decide(LoggingEvent event){
        if(event.getMessage().toString().contains(this.matchString)){
            return this.decision;
        }
        else{
            return 0;
        }
    }
}