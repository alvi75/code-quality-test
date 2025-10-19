import java.util.*;

public class Generated_6367677b1a6d9265ec0182bd {
    /**Formats LoggingEvent as a fixed-format string**/
    public String format(final LoggingEvent event){
        StringBuffer buf = new StringBuffer();
        //Format time stamp
        if (event instanceof org.apache.log4j.spi.LocationInfo) {
            LocationInfo locationInfo = (LocationInfo)event;
            buf.append(locationInfo.getFileName());
            buf.append(":");
            buf.append(locationInfo.getLineNumber());
            buf.append(": ");
        }
        else{
            buf.append(event.getLocationInformation());
            buf.append(" ");
        }
        
        //Format level
        buf.append(levelToSyslogEquivalent(event.getLevel()));
        buf.append(" ");
        
        //Format thread name
        buf.append(event.getThreadName());
        buf.append(" ");
        
        //Format message
        buf.append(event.getMessage().toString());
        buf.append("\n");
        return buf.toString();
    }
}