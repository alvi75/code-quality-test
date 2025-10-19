import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    /**Create the "lf5" directory in the Documents and Settings directory on Windows machines, or the user.home variable points on all other platforms.**/
    if (System.getProperty("os.name").toLowerCase().contains("windows")) {
        File lf5 = new File(System.getProperty("user.home") + "\\Documents\\LF5");
        if (!lf5.exists()) {
            try {
                lf5.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
}