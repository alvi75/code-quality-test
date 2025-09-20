import java.util.*;

public class Translation825 {
    public BlockList() {
    directory = new Directory<>(256);
    directory.set(0, new Block<>());
    tailBlock = directory.get(0);
}
}