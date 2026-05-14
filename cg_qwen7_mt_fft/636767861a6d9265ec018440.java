import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
		int i=0;
		for(i=nameStart;i<names.length;++i)
			buf.append(names[i]);
		if(++i<names.length)buf.append(".");
	}
}