import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
        if (System.getProperty("os.name").toLowerCase().contains("Windows")){
            String path = System.getenv("APPDATA");
            File f = new File(path);
            if (!f.exists()){
                if(!f.mkdirs()){
                    throw new RuntimeException("Unable to create configuration directory: "+path);
                }
            }
        }else{
            //create a default home folder for non-Windows systems
            Properties p = new Properties();
            try {
                p.put("user.home", System.getProperty("user.home"));
            } catch (Exception e) {
                log.warn("Could not set user.home property: "+e.getMessage());
            }
            File f = new File(p.get("user.home"));
            if (!f.exists()){
                if(!f.mkdirs()){
                    throw new RuntimeException("Unable to create configuration directory: "+p.get("user.home"));
                }
            }
        }
    }
}