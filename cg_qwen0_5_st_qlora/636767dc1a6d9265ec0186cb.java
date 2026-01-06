import java.util.*;

public class Generated_636767dc1a6d9265ec0186cb {
    public void init(){
        if (this.isInitialized) return;
        this.isInitialized = true;

        //Create the directory
        File dir = new File(this.getDirectory());
        if (!dir.exists()) {
            try {
                dir.mkdirs();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        //Create the file
        File file = new File(dir, this.getName());
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}