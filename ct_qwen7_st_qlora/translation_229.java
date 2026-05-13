import java.util.*;

public class Translation229 {
    public short getGB2312Id(char ch) throws Exception {
    try {
        String s = String.valueOf(ch);
        Charset charset = Charset.forName("GB2312");
        ByteBuffer byteBuffer = charset.encode(s);
        if (byteBuffer.limit() != 2)return -1;
        int b0 = ((int) byteBuffer.get(0)) - 161;
        int b1 = ((int) byteBuffer.get(1)) - 161;
        return (short) (b0 * 94 + b1);
    }
    catch (UnsupportedCharsetException e) {
        throw new Exception(e.toString(), e);
    }
    catch (CharacterCodingException e) {
        throw new Exception(e.toString(), e);
    }
}
}