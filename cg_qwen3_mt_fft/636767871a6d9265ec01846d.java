import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
		String path = System.getProperty("user.home");
		if(path.endsWith("Documents and Settings")){
			path = path.substring(0,path.lastIndexOf("Documents and Settings"));
		}
		File f = new File(path+"/lf5");
		if(!f.exists()){
			f.mkdir();
		}
	}
}