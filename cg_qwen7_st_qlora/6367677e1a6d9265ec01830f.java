import java.util.*;

public class Generated_6367677e1a6d9265ec01830f {
    public String format(LoggingEvent event){
        if (event == null) {
            throw new IllegalArgumentException("LoggingEvent cannot be null");
        }
        
        StringBuffer sbuf = new StringBuffer(bufferSize);
        int i;
        for(i=0; i<len; i++){
            char c = buffer[i];
            if(c=='%'){
                i++;
                if(i < len){
                    c = buffer[i];
                    switch(c){
                        case 'c':
                            appendCategoryName(sbuf,event);
                            break;
                        case 'd':
                            appendDate(sbuf,event);
                            break;
                        case 'm':
                            appendMessage(sbuf,event);
                            break;
                        case 'n':
                            sbuf.append(lineSeparator);
                            break;
                        default:
                            sbuf.append('%');
                            sbuf.append(c);
                    }
                }else{
                    sbuf.append('%');
                }
            } else {
                sbuf.append(c);
            }
        }

        return sbuf.toString();
    }
}