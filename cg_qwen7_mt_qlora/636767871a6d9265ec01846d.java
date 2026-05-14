import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
        String path = System.getProperty("user.home");
        if (System.getProperty("os.name").startsWith("Windows")) {
            path += "\\Documents and Settings\\";
        }
        File lf5Dir = new File(path + "lf5");
        lf5Dir.mkdirs();
    }
}