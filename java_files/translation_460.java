import java.util.*;

public class Translation460 {
    0;
int end = start + len;
while (start < end){
    char c = buf[start++];
    if (c == '\n'){
        line++;
        col = 0;
    }
    else if (c == '\r'){
        line++;
        col = 0;
    }
    else{
        col++;
    }
}
}
}