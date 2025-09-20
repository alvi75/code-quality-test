import java.util.*;

public class Translation293 {
    public int getAheadCount() {
    return aheadCount;
}
Human Translate from Java to C#: public void setMaxDocValuesSize(long size) {
    this.maxDocValuesSize = size;
}
Human Translate from C# to Java: public override string ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[REF]\n");
    buffer.Append(" .reftype = ").Append(StringUtil.ToHexString(RawRefType)).Append("\n");
    buffer.Append(" .key = ").Append(Key).Append("\n");
    buffer.Append(" .value = ").Append(Value).Append("\n");
    buffer.Append("[/REF]\n");
    return buffer.ToString();
}
}