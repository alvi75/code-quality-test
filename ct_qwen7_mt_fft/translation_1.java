import java.util.*;

public class Translation1 {
    public void addAll(BlockList<E> src) {
    if (src.size() == 0)return;
    if (tailDirIdx_ > 0 || size_ + src.size() > directory_.length)grow(src.size());
    System.arraycopy(src.directory_, 0, directory_, size_, src.tailDirIdx_);
    size_ += src.size();
    modCount++;
}
}