import java.util.*;

public class Generated_636766ae1a6d9265ec0175dc {
    public Boolean isPartialContentResponse(){
        if (this.responseStatus == null || this.responseStatus.code() != 206) {
            return false;
        }
        String contentRange = this.headers.getFirst("Content-Range");
        if(contentRange==null){
            return false;
        }

        // Strip off "bytes="
        String[] parts = contentRange.split("[ -/]+");
        if(parts.length!=3){
            throw new RuntimeException("Invalid value for Content-Range header: "+contentRange);
        }

        long start = Long.parseLong(parts[1]);
        long end   = Long.parseLong(parts[2].substring(0,parts[2].length()-1));
        long length= Long.parseLong(parts[0]);

        return ((start>0)&&(end>=start)&&(end<length));
    }
}