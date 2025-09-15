import java.util.*;

public class Translationtranslation_44 {
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        int length = this.length();
        builder.append(this.directory().getPath());
        builder.append(':');
        for(int i=0;
        i<length;
        i++) {
            builder.append(this.getComponent(i));
            if (i < (length-1))builder.append("/");
        }
        return builder.toString();
    }
}