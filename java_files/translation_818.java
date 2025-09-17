import java.util.*;

public class Translationtranslation_818 {
    public void preSerialize() {
        if (records.getTabpos() > 0) {
            TabIdRecord tib = records.get(records.getTabpos());
            if (tib.getNumberOfTabs() < boundsheets.size()) {
                fixTabIdRecord();
            }
        }
}