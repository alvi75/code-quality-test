import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    /**Initializes a directory.**/
public void init(){
		if (this.directory.exists()){
			this.directory.delete();
		}
		this.directory.mkdirs();
	}
}