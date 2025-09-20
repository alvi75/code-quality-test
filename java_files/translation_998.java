import java.util.*;

public class Translation998 {
    public QueryConfigHandler getQueryConfigHandler() {
    return this.queryConfig;
}
Human Translate from C# to Java: public override string ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[REF]\n");
    buffer.Append(" .rownum = ").Append(RowNum).Append("\n");
    buffer.Append(" .colunmindex = ").Append(ColumnIndex).Append("\n");
    buffer.Append("[/REF]\n");
    return buffer.ToString();
}
}