import java.util.*;

public class Translation825 {
    public BlockList() {
    directory = new Block<?, ?>[INITIAL_DIRECTORY_SIZE];
    Arrays.fill(directory, EMPTY_BLOCK);
    directory[0] = new Block<>(INITIAL_BLOCK_SIZE);
    tailBlock = directory[0];
}
}