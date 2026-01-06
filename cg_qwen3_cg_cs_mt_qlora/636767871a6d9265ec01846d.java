import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
        String home = System.getProperty("user.home");
        if (home == null) {
            throw new RuntimeException("Could not find user.home property.");
        }
        File lf5Dir = new File(home + File.separator + ".lf5");
        if (!lf5Dir.exists()) {
            if (!lf5Dir.mkdir()){
                throw new RuntimeException("Could not create .lf5 directory in " + home);
            }
        }
    }
}