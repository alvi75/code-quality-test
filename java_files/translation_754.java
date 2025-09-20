import java.util.*;

public class Translation754 {
    public void removeName(int index) {
    int n = names.size();
    if (n < index)throw new IndexOutOfBoundsException("index=" + index + " size=" + n);
    names.remove(index);
    workbook.removeName(index);
}
}