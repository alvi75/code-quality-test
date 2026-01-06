import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
		String home = System.getProperty("user.home");
		if(home == null){
			throw new RuntimeException("Unable to determine user.home property.");
		}
		
		File lf5Dir = new File(home + "/.lf5");
		lf5Dir.mkdir();
	}
}