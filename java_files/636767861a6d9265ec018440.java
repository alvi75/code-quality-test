import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    /**The given name can be split into several substrings by ".",and abbreviate the name in the buf by deleting the first count substrings. **/
    public void abbreviate(final int nameStart,final StringBuffer buf){
        final String[] names = this.name.split("\\.");
        for (int i = 0; i < count; i++) {
            if(i<names.length)
                buf.append(names[i]);
            else
                buf.append(".");
        }
    }
}