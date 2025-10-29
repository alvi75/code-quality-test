import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    public void init(){
        if (this.directory == null){
            throw new RuntimeException("Directory is not set");
        }
        if (!this.directory.exists()){
            this.directory.mkdirs();
        }
    }
}