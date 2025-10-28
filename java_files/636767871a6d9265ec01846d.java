import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    /**
     * Create the "lf5" directory in the Documents and Settings directory on Windows machines, or the user.home variable points on all other platforms.
     */
    public static void createConfigurationDirectory(){
        String path = null;
        if (System.getProperty("os.name").toLowerCase().indexOf("win") >= 0){
            path = System.getenv("USERPROFILE");
        }else{
            path = System.getProperty("user.home");
        }
        File f = new File(path + "/Documents and Settings/lf5");
        if (!f.exists()){
            f.mkdirs();
        }
    }
}