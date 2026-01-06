import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    public long readRawVarint64()
    throws IOException {
        byte tmp = buffer[offset++];
        if (tmp >= -112) {
            return tmp;
        }
        int result = tmp + 112;
        if ((tmp = buffer[offset++]) >= -103) {
            return (result << 7) | tmp;
        }
        result = (result << 7) | tmp;
        if ((tmp = buffer[offset++]) >= -104) {
            return (result << 7) | tmp;
        }
        result = (result << 7) | tmp;
        if ((tmp = buffer[offset++]) >= -105) {
            return (result << 7) | tmp;
        }
        result = (result << 7) | tmp;
        if ((tmp = buffer[offset++]) >= -106) {
            return (result << 7) | tmp;
        }
        result = (result << 7) | tmp;
        if ((tmp = buffer[offset++]) >= -107) {
            return (result << 7) | tmp;
        }
        result = (result << 7) | tmp;
        if ((tmp = buffer[offset++]) >= -108) {
            return (result << 7) | tmp;
        }
        result = (result << 7) | tmp;
        if ((tmp = buffer[offset++]) >= -109) {
            return (result << 7) | tmp;
        }
        result = (result << 7) | tmp;
        if ((tmp = buffer[offset++]) >= -110) {
            return (result << 7) | tmp;
        }
        result = (result << 7) | tmp;
        if ((tmp = buffer[offset++]) >= -111) {
            return (result << 7) | tmp;
        }
        result = (result << 7) | tmp;
        if ((tmp = buffer[offset++]) >= -112) {
            return (result << 7) | tmp;
        }
        throw new ProtobufException("varint representation is incorrect");
    }
}