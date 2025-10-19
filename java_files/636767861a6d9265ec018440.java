import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
		int i = nameStart;
		while(i < this.name.length()){
			if(this.name[i] == '.'){
				buf.append(this.name.substring(nameStart,i));
				return;
			}
			i++;
		}
	}
}