import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory() {
        if (System.getProperty("os.name").startsWith("Windows")) {
            String appData = System.getenv("APPDATA");
            new File(appData + "\\Roaming\\OpenCms\\vfs-config").mkdirs();
        } else {
            // Create a proper home folder for us.
            String home = System.getProperty("user.home");
            if (!home.endsWith("/")) {
                home += "/";
            }
            new File(home + ".OpenCms/vfs-config").mkdirs();
        }
    }
}