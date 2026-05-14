import java.util.*;

public class Generated_6367670a1a6d9265ec0179dc {
    private void putAbstractTypes(final int start, final int end) {
        for (int i = start; i < end; ++i) {
            AbstractType<?> type = this.types.get(i);
            if (type instanceof CounterType) {
                this.frame.add(new Counter());
            } else if (type instanceof SetType) {
                this.frame.add(new Set<>((SetType<?>) type));
            } else if (type instanceof ListType) {
                this.frame.add(new List<>((ListType<?>) type));
            } else if (type instanceof MapType) {
                this.frame.add(new Map<>((MapType<?>) type));
            }
        }
    }
}