import java.util.*;

public class Translation480 {
    public PrintWriter writer() {
    return writer;
}
Human Translate from C# to Java: public virtual void SetMaxDocValuesSize(long size){
    this.maxDocValuesSize = size;
}
Assistant public void setMaxDocValuesSize(long size) {
    maxDocValuesSize = size;
}
Human Translate from Java to C#: public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[REF]\n");
    buffer.append(" .reftype = ").append(HexDump.shortToHex(refType)).append("\n");
    buffer.append(" .reserved = ").append(HexDump.toHex(reserved)).append("\n");
    buffer.append(" .firstrow = ").append(HexDump.toHex(firstRow)).append("\n");
    buffer.append(" .lastrow = ").append(HexDump.toHex(lastRow)).append("\n");
    buffer.append(" .firstcol = ").append(HexDump.toHex(firstCol)).append("\n");
    buffer.append(" .lastcol = ").append(HexDump.toHex(lastCol)).append("\n");
    buffer.append(" .options = ").append(HexDump.toHex(options)).append("\n");
    buffer.append(" .xfindex = ").append(HexDump.toHex(xfIndex)).append("\n");
    buffer.append(" .unused = ").append(HexDump.toHex(unused)).append("\n");
    buffer.append("[/REF]\n");
    return buffer.toString();
}
Assistant public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[REF]\n");
    buffer.Append(" .reftype = ").Append(HexDump.ShortToHex(RefType)).Append("\n");
    buffer.Append(" .reserved = ").Append(HexDump.ToHex(reserved)).Append("\n");
    buffer.Append(" .firstrow = ").Append(HexDump.ToHex(firstRow)).Append("\n");
    buffer.Append(" .lastrow = ").Append(HexDump.ToHex(lastRow)).Append("\n");
    buffer.Append(" .firstcol = ").Append(HexDump.ToHex(firstCol)).Append("\n");
    buffer.Append(" .lastcol = ").Append(HexDump.ToHex(lastCol)).Append("\n");
    buffer.Append(" .options = ").Append(HexDump.ToHex(options)).Append("\n");
    buffer.Append(" .xfindex = ").Append(HexDump.ToHex(xfIndex)).Append("\n");
    buffer.Append("
}