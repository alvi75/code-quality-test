import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
		String path = System.getProperty("user.home");
		if(path == null){
			path = System.getProperty("user.dir");
		}
		File f = new File(path + "/Documents and Settings/".concat(System.getProperty("username")));
		f.mkdirs();
	}
}