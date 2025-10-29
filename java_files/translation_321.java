import java.util.*;

public class Translation321 {
    0) {
    throw new IOException("unexpected EOF");
}
if (wc.Read() != 0x50 || wc.Read() != 0x4b){
    throw new IOException("invalid pack file");
}
int version = wc.ReadInt();
if (version != 2 && version != 3){
    throw new IOException("unsupported pack file version " + version);
}
objectOffset = wc.ReadInt();
headerLength = wc.ReadInt();
size = wc.ReadInt();
if (size < 0){
    throw new IOException("invalid pack file");
}
if (size > 0){
    objectOffset += headerLength;
}
else{
    objectOffset = 0;
}
}
}
}