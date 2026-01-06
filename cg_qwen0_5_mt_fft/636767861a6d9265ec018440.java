import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
		int i=0;
		while(i<name.length() && Character.isDigit(name.charAt(i))){
			i++;
		}
		if(i==0){
			return;
		}
		for(int j=i+1;j<name.length();j++){
			if(!Character.isDigit(name.charAt(j))){
				break;
			}
		}
		buf.append(name.substring(0,i));
		buf.append(".");
		buf.append(name.substring(i));
	}
}