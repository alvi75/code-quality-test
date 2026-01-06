import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
        final String[] names = this.name.split("\\.");
        for(int i=0;i<names.length;i++){
            if(i==nameStart){
                break;
            }
            buf.append(names[i]);
            if(i!=names.length-1){
                buf.append(".");
            }
        }
    }
}