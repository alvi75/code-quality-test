import java.util.*;

public class Translation184 {
    csharp public override void Set(int index, long value){
    int o = index / 10;
    int b = index % 10;
    int shift = b * 6;
    blocks[o] = (blocks[o] & (~((long)((uint)(63L)) << shift))) | ((long)((ulong)value) << shift);
}
}