import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
        File f = new File(System.getProperty("user.home") + "/Documents/lf5");
        if (!f.exists()){
            try {
                f.mkdirs();
            } catch (Exception e) {
                System.out.println("Error creating lf5 directory: "+e.getMessage());
            }
        }
    }
}