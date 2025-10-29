import java.util.*;

public class Translation108 {
    ublic Color getColor(int index) {
    if (index == AUTOMATIC_INDEX) return AUTOMATIC;
    ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
    try {
        writePalette(baos);
    }
    catch (IOException e) {
        throw new RuntimeException(e);
    }
    int[] colors = new int[baos.size() / 3];
    for (int i = 0;
    i < colors.length;
    i++) {
        colors[i] = (baos.read() << 8) | baos.read();
    }
    return new CustomColor(index, colors);
}
}