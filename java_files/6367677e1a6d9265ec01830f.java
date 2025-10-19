import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    public String format(LoggingEvent event){
		if (converter == null) {
			return super.format(event);
		}
		else {
			return converter.convertToFullPatternString(event);
		}
	}
}