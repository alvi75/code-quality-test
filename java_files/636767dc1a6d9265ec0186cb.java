import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    public void init(){
		if (this.exists()) {
			this.delete();
		}
		try{
			this.mkdirs();
		}catch(IOException e){
			throw new RuntimeException(e);
		}
	}
}