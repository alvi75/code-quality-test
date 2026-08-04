import java.util.*;

public class Generated_636767871a6d9265ec01846d {
    public static void createConfigurationDirectory(){
		File configDir = new File(getConfigurationDirectory());
		if(!configDir.exists()){
			configDir.mkdir();
		}
	}
}