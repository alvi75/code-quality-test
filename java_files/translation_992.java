import java.util.*;

public class Translationtranslation_992 {
    public void serialize(LittleEndianOutput out) {
        out.writeByte(getPrintAreaCount());
        for (int i = 0;
        i < _printAreas.size();
        i++) {
            _printAreas.get(i).serialize(out);
        }
    }
}