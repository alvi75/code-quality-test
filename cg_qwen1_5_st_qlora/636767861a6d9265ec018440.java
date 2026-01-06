import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    /**
 * The given name can be split into several substrings by ".",and abbreviate the name in the buf by deleting the first count substrings.
 */
    public void abbreviate(final int nameStart,final StringBuffer buf){
        if(nameStart<0||nameStart>=mName.length()){
            return;
        }
        final String[] names=mName.split("\\.");
        for(int i=0;i<mCount&&i<names.length;++i){
            buf.append(names[i]);
            if(i!=mCount-1){
                buf.append(".");
            }
        }
    }
}