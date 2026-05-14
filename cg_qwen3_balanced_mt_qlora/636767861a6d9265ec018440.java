import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    /**The given name can be split into several substrings by ".",and abbreviate the name in the buf by deleting the first count substrings. **/
    public void abbreviate(final int nameStart,final StringBuffer buf){
        if(nameStart < 0 || nameStart >= names.length)
            throw new IllegalArgumentException("nameStart must be between 0 and " + (names.length - 1));
        
        for(int i = 0; i < names.length; i++){
            if(i == nameStart)
                continue;
            
            buf.append(names[i]);
            if(i != names.length - 1)
                buf.append(".");
        }
    }
}