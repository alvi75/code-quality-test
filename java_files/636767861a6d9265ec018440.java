import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,StringBuffer buf){
        if(nameStart < 0 || nameStart >= this.name.length) {
            return;
        }
        final int len = this.name.length - nameStart;
        for(int i=0;i<len;i++){
            buf.append(this.name.substring(nameStart,i+nameStart));
        }
    }
}