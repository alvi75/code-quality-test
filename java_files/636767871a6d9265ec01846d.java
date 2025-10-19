import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
		if (System.getProperty("os.name").contains("Windows")){
			String path = System.getenv("DOCUMENTS");
			path += "\\lf5";
			File f = new File(path);
			f.mkdir();
		}
		else{
			String path = System.getProperty("user.home") + "/lf5";
			File f = new File(path);
			f.mkdir();
		}
	}
}