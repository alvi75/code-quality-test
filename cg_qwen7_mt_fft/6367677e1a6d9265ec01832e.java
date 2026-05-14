import java.util.*;

public class Generated_6367677e1a6d9265ec01832e {
    public Logger exists(String name) {
		if (name == null)
			return null;
		
		LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
		org.apache.log4j.Logger log = ctx.getLogger(name);
		if(log !=null){
			return new Logger(log,this);
		}
		return null;
	}
}