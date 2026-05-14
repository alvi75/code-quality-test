import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
        String lf5Dir = null;
        if(System.getProperty("os.name").startsWith("Windows")){
            lf5Dir = System.getenv("USERPROFILE") + File.separatorChar + "Documents"
                    + File.separatorChar + "LF5";
        }else{
            lf5Dir = System.getProperty("user.home");
        }
        File lf5DirFile = new File(lf5Dir);
        if(!lf5DirFile.exists()){
            lf5DirFile.mkdirs();
        }
    }
}