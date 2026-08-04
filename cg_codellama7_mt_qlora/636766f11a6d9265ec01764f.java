import java.util.*;

public class Generated_636766f11a6d9265ec01764f {
    public Collection<Object> values() {
        return Collections.unmodifiableCollection(new AbstractCollection<Object>() {
            @Override
            public Iterator<Object> iterator() {
                return new Iterator<Object>() {
                    private Iterator<Entry<String, Object>> it = entrySet().iterator();

                    @Override
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override
                    public Object next() {
                        return it.next().getValue();
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }

            @Override
            public int size() {
                return BeanMap.this.size();
            }
        });
    }
}