import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory() {
        String configDir = System.getProperty("user.home") + File.separator + "lf5";
        File configDirFile = new File(configDir);
        if (!configDirFile.exists()) {
            configDirFile.mkdir();
        }
    }
}