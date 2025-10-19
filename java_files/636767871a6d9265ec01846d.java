import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
		String home = System.getProperty("user.home");
		if (home.endsWith(File.separator)) {
			home = home.substring(0, home.length() - 1);
		}
		File dir = new File(home + File.separator + ".lf5");
		dir.mkdirs();
	}
}