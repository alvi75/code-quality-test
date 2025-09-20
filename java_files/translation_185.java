import java.util.*;

public class Translation185 {
    public void setMaxDocValuesSize(long size) {
    this.maxDocValuesSize = size;
}
Human: Translate from Java to C#: public static String getExtension(String name) {
    int i = name.lastIndexOf('.');
    if (i < 0)return "";
    else return name.substring(i + 1, name.length());
}
}