import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    /**
	 * /**Create the "lf5" directory in the Documents and Settings directory on Windows machines, or the user.home variable points on all other platforms.
	 */
	public static void createConfigurationDirectory(){
		String home = System.getProperty("user.home");
		if(home == null){
			throw new RuntimeException("Unable to determine user.home property.");
		}
		
		File lf5Dir = new File(home + "/lf5");
		if(!lf5Dir.exists()){
			lf5Dir.mkdir();
		}
	}
}