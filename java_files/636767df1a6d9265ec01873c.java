import java.util.*;

public class Generated_636767df1a6d9265ec01873c {
    public String id(String entityId){
		if(entityId==null)
			return null;
		String[] parts = entityId.split(idConnector);
		StringBuilder sb = new StringBuilder();
		sb.append(parts[0]);
		sb.append(idConnector);
		sb.append(parts[1]);
		return sb.toString();
	}
}