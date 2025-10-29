import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
        String home = System.getProperty("user.home");
        if (home == null){
            throw new RuntimeException("Unable to determine user.home property.");
        }
        File lf5Dir = new File(home + "/.lf5");
        if (!lf5Dir.exists()){
            boolean success = lf5Dir.mkdir();
            if (!success){
                throw new RuntimeException("Unable to create .lf5 directory in " + home);
            }
        }
    }
}