import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    /**Create the "lf5" directory in the Documents and Settings directory on Windows machines, or the user.home variable points on all other platforms.
@throws IOException if there is a problem creating the directory.
*/
public static void createConfigurationDirectory() {
        try {
            File lf5Dir = new File(System.getProperty("user.home"), "Documents and Settings");
            if (!lf5Dir.exists()) {
                if (lf5Dir.mkdirs())
                    System.out.println("Created "+lf5Dir.getAbsolutePath());
                else
                    throw new IOException("Could not create "+lf5Dir.getAbsolutePath());
            }
            lf5Dir = new File(lf5Dir, "LF5");
            if (!lf5Dir.exists()) {
                if (lf5Dir.mkdirs())
                    System.out.println("Created "+lf5Dir.getAbsolutePath());
                else
                    throw new IOException("Could not create "+lf5Dir.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}