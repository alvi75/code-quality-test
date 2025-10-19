import java.util.*;

public class Generated_636767a81a6d9265ec0185fc {
    public int readTag()
    throws IOException
  {
    while (true) {
      int tag = _in.read();

      if (tag == -1)
        return 0;

      tag = (tag << TAG_TYPE_BITS) | getTagType(tag);

      switch (tag >> TAG_TYPE_BITS) {
      case TAG_TYPE_END:
        if (tag != TAG_END) {
          log.warning(L.l("readTag: unexpected end tag 0x{0:X}",
                          Integer.valueOf(tag)));
        }
        return tag;

      case TAG_TYPE_STRUCT:
        return tag;

      case TAG_TYPE_ARRAY:
        return tag;

      case TAG_TYPE_BYTE:
      case TAG_TYPE_SHORT:
      case TAG_TYPE_INT:
      case TAG_TYPE_LONG:
      case TAG_TYPE_FLOAT:
      case TAG_TYPE_DOUBLE:
      case TAG_TYPE_STRING:
      case TAG_TYPE_CLASS:
      case TAG_TYPE_ARRAY_OBJECT:
      case TAG_TYPE_OBJECT:
        return tag;
      }

      // skip this object
      long len = getLengthValue(tag);
      skip(len);
    }
  }
}