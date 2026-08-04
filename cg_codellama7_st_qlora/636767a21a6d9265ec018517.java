import java.util.*;

public class Generated_636767a21a6d9265ec018517 {
    public final byte[] toByteArray(){
        if(this.buffer.position() == 0){
            return new byte[0];
        }
        byte[] bytes = new byte[this.buffer.position()];
        this.buffer.flip();
        this.buffer.get(bytes);
        return bytes;
    }
}