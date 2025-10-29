import java.util.*;

public class Translation848 {
    0;
int len = b.length;
while (len > 0){
    if (_ulrOutput.remaining() < len){
        WriteContinueIfRequired(len);
    }
    _ulrOutput.write(b, pos, len);
    pos += len;
    len -= len;
}
}