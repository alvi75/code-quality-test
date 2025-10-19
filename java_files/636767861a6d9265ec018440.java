import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
		int i;
		for(i=0;i<nameStart;++i)
			buf.append(name[i]);
		buf.append('.');
	}
	
	/**
	 * @param name
	 * @param buf
	 */
	public void abbreviate(String name,StringBuffer buf){
		int i;
		for(i=0;i<name.length();++i)
			buf.append(name[i]);
		buf.append('.');
	}
}