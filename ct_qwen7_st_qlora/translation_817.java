import java.util.*;

public class Translation817 {
    public int get(String name, int dflt) {
    Integer valR = valByRound.get(name);
    if(valR!=null) {
        return valR.intValue();
    }
    String sval = props.getProperty(name,dflt+"");
    if(sval.indexOf(":")<0) {
        return Integer.parseInt(sval, radix);
    }
    int k = sval.indexOf(":");
    String colName = sval.substring(0,k-0);
    sval = sval.substring(k+1);
    colForValByRound.put(name, colName);
    valByRound.put(name, propToIntArray(sval));
    return get(name);
}
}