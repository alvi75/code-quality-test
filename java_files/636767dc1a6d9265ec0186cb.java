import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    public void init(){
        if(!isInitialized){
            isInitialized = true;
            try {
                if (this.directory.exists()) {
                    this.directory.delete();
                }
                this.directory.mkdirs();
            } catch (Exception e) {
                logger.error("Error while creating directory: " + this.directory.getAbsolutePath(), e);
            }
        }
    }
}