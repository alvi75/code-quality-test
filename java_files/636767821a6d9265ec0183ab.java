import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    public boolean hasThrown(){
		if (thrown == null || thrown.isEmpty())
			return false;
		for (String s : thrown)
			if (!s.equals("null"))
				return true;
		return false;
	}
}