import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
		if (System.getProperty("os.name").equals("Windows")){
			File f = new File(System.getenv("HOMEDIR") + "\\Documents\\Settings\\lf5");
			f.mkdirs();
		}
		else{
			File f = new File(System.getProperty("user.home"));
			f.mkdirs();
		}
	}
}