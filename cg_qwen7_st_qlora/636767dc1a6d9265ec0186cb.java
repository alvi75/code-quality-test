import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    public void init(){
		if (this.directory == null){
			throw new IllegalStateException("Directory is not set");
		}
		
		try {
			this.file = new File(this.directory, this.name);
			
			if (!file.exists()){
				file.mkdirs();
			} else if (!file.isDirectory()){
				throw new IllegalArgumentException("File exists but it's not a directory: " + file.getAbsolutePath());
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}