import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
        if(nameStart==0) return;
        final String[] names = name.split("\\.");
        for(int i=1;i<names.length;i++){
            buf.append(names[i]);
            if(i!=names.length-1) buf.append(".");
        }
    }
}