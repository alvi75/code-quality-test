import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
        final String[] names = this.name.split("\\.");
        for(int i=0;i<nameStart;i++){
            if(i>0)buf.append('.');
            buf.append(names[i]);
        }
    }
}