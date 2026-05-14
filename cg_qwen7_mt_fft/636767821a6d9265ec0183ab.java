import java.util.*;

public class Generated_636767821a6d9265ec0183ab {
    public boolean hasThrown() {
        for (int i = 0; i < this.basicBlockList.size(); ++i) {
            BasicBlock basicBlock = this.basicBlockList.get(i);
            if (basicBlock.hasInstructionWithException()) {
                return true;
            }
        }

        return false;
    }
}