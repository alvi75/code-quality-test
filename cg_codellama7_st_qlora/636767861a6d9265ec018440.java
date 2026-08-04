import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
		int count=0;
		int i=nameStart;
		while(i<buf.length()){
			if(buf.charAt(i)=='.'){
				count++;
				if(count==this.count){
					buf.delete(nameStart,i);
					return;
				}
			}
			i++;
		}
	}
}