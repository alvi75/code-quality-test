import java.util.*;

public class Generated_636767781a6d9265ec018250 {
    public int decide(LoggingEvent event){
		if (this.messagePattern != null) {
			String msg = event.getMessage().toString();
			if (msg.matches(this.messagePattern)) {
				return this.decision;
			}
		}

		if (this.stringMatch != null) {
			boolean match = this.stringMatch.matcher(event.getMessage().toString()).matches();
			if (match) {
				return this.decision;
			}
		}

		return Decision.IGNORED;
	}
}