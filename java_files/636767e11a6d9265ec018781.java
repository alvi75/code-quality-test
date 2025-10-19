import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Override
    public void accept(final METRICS data){
        final int hash = data.getHash();
        final long timestamp = data.getTimestamp();

        //check for a stale entry
        if (staleEntry(hash)) {
            return;
        }

        //try to get the entry from the map
        Entry<METRICS> e = m_map.get(hash);

        //if there is no entry, create one
        if (e == null) {
            e = new Entry<METRICS>(hash, data);
            m_map.put(hash, e);
        } else { //otherwise update the entry

            //if the entry is expired, then abandon the old entry
            if (isExpired(e, timestamp)) {
                m_map.remove(hash);
                e = new Entry<METRICS>(hash, data);
                m_map.put(hash, e);
            }
            //else combine the entries
            else {
                e.data = combine(e.data, data);
            }
        }
    }
}