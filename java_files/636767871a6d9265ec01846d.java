import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
        String path = System.getProperty("user.home");
        if (path == null || path.length() == 0) {
            path = ".";
        }
        File f = new File(path + "/Documents/lf5");
        if (!f.exists()) {
            try {
                f.mkdirs();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}