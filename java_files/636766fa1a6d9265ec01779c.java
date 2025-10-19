import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators){
		StringBuilder sb = new StringBuilder();
		while(this.pos < this.line.length() && !contains(terminators, this.line.charAt(this.pos))){
			sb.append(this.line.charAt(this.pos));
			this.pos++;
		}
		return sb.toString();
	}
}