import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    public void init(){
		if(this.directory==null){
			throw new IllegalArgumentException("Directory is null");
		}
		if(!this.directory.exists()){
			this.directory.mkdirs();
		}
		if(!this.directory.isDirectory()){
			throw new IllegalArgumentException("Directory is not a directory");
		}
		if(!this.directory.canWrite()){
			throw new IllegalArgumentException("Directory is not writable");
		}
		if(this.directory.list().length>0){
			throw new IllegalArgumentException("Directory is not empty");
		}
		this.directory.deleteOnExit();
	}
}