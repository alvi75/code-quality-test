import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(final int nameStart,final StringBuffer buf){
		if (nameStart < 0 || nameStart >= this.name.length()) {
			throw new IllegalArgumentException("nameStart must be between 0 and " + this.name.length() + ": " + nameStart);
		}
		final String[] parts = this.name.split("\\.");
		for(int i=0;i<parts.length;i++){
			if(i==0 && nameStart > 0){
				buf.append(parts[i].substring(0,nameStart));
				buf.append(".");
			}else if(i>=nameStart){
				buf.append(parts[i]);
				if(i!=parts.length-1){
					buf.append(".");
				}
			}
		}
	}
}