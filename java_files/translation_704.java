import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Translationtranslation_704 {
    public Reader create(Reader input) {
        return new PersianNormalizationFilter(CharsetReaderUtil.subList(input, NORMALIZE_PERSIAN));
    }
}