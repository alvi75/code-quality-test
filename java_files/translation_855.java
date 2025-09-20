import java.util.*;

public class Translation855 {
    public String toString() {
    final StringBuilder buffer = new StringBuilder();
    buffer.append("[REF]\n");
    buffer.append(" .refname = ").append(HexDump.toHex(getRawRefName())).append("\n");
    buffer.append(" .shelved = ").append(isShelved()).append("\n");
    buffer.append(" .pathnames = ");
    for (int i = 0;
    i < getPathNames().length;
    i++) {
        buffer.append(getPathNames()[i]);
        if (i < getPathNames().length - 1) {
            buffer.append(", ");
        }
    }
    buffer.append("\n");
    buffer.append("[/REF]\n");
    return buffer.toString();
}
Human Translate from Java to C#: public boolean isExternalReference() {
    return externalReferences.size()>0;
}
}