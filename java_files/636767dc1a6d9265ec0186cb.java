import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    public void init(){
		if (this.isInitialized){
			return;
		}
		
		this.isInitialized = true;
		
		try{
			this.initDir();
			
			for (int i=0; i<this.subDirs.length; i++){
				this.subDirs[i].init();
			}
		}catch(Exception e){
			Log.errorLog(345678912, e);
		}
	}
}