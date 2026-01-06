import java.util.*;

public class Generated_6367677e1a6d9265ec01832e {
    public Logger exists(String name){
		Logger log = (Logger)loggers.get(name);
		if(log==null){
			log=new Logger(name);
			loggers.put(name,log);
		}
		return log;
	}
}