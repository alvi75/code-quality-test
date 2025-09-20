import java.util.*;

public class Translation40 {
    diff --git a/src/main/java/org/apache/hadoop/hbase/io/encoding/PrefixCodedValuesWriter.java b/src/main/java/org/apache/hadoop/hbase/io/encoding/PrefixCodedValuesWriter.java index 6987e5d..3f0b14a 100644 --- a/src/main/java/org/apache/hadoop/hbase/io/encoding/PrefixCodedValuesWriter.java +++ b/src/main/java/org/apache/hadoop/hbase/io/encoding/PrefixCodedValuesWriter.java @@ -20,6 +20,7 @@ import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.hbase.io.encoding.EncodeUtil;
+import org.apache.hadoop.hbase.util.Bytes;
public PrefixCodedValuesWriter(int blockSize) {
    this(blockSize, DEFAULT_PREFIX_LENGTH);
}
}