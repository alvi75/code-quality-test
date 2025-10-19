import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
		int count = 0;
		for (int i = nameStart; i < name.length(); i++) {
			if(name.charAt(i) == '.'){
				count++;
			}
			else{
				break;
			}
		}
		buf.delete(0,count);
	}
}