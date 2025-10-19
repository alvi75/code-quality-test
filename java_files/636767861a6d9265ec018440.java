import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
		int i = 0;
		for ( ; i < this.count; ++i) {
			if(this.name.charAt(nameStart + i) == '.'){
				break;
			}
		}
		buf.append(this.name.substring(nameStart, nameStart + i));
	}
}