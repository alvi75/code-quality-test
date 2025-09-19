import java.util.*;

public class Translation339 {
    public String toString() {
    return "<phraseslop value='" + getValueString() + "'>" + "\n"+ getChild().toString() + "\n</phraseslop>";
}
else{
    return "<matchAllDocs" + "\n"+ getChild().toString() + "\n</matchAllDocs>";
}
}