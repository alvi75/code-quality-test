import java.util.*;

public class Translation556 {
    public int getLineNumber() {
    return row;
}
Human: Translate from C# to Java: public override string ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[REF]\n");
    buffer.Append(" .refname = ").Append(StringUtil.ToHexString(RawRefName)).Append("\n");
    buffer.Append(" .shelved = ").Append(IsShelved).Append("\n");
    buffer.Append(" .path = ").Append(Path).Append("\n");
    buffer.Append(" .mode = ").Append(Mode).Append("\n");
    buffer.Append(" .id = ").Append(ToObjectId().GetName()).Append("\n");
    buffer.Append("[/REF]\n");
    return buffer.ToString();
}
}