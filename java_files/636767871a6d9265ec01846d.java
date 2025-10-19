import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
        File dir = new File(System.getProperty("user.home") + "/.lf5");
        if (!dir.exists()){
            try {
                boolean created = dir.mkdirs();
                if (created){
                    System.out.println("The configuration directory was successfully created.");
                } else {
                    System.err.println("Failed to create the configuration directory.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}