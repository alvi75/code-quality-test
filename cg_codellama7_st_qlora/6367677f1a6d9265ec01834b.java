import java.util.*;

public class Generated_6367677f1a6d9265ec01834b {
    public void put(LoggingEvent o){
		if(o==null)
			return;
		if(buf.size()==buf.capacity()){
			LoggingEvent[] newbuf = new LoggingEvent[buf.capacity()*2];
			System.arraycopy(buf.getArray(),0,newbuf,0,buf.size());
			buf = new CircularFifoBuffer(newbuf);
		}
		buf.add(o);
	}
}