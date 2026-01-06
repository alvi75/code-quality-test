import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    /**Initializes a directory.**/
    public void init(){
        if (this.directory == null){
            this.directory = new File(this.path);
            if (!this.directory.exists()){
                this.directory.mkdirs();
            }
        }
    }
}