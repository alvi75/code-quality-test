import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
		int i;
		final int len = name.length();
		for(i=0;i<len;i++){
			if(name.charAt(i) == '.'){
				buf.append(name.substring(0, i));
				buf.append('.');
				buf.append(name.substring(i + 1));
				break;
			}
		}
		if(i == -1){
			buf.append(name);
		}
	}
}