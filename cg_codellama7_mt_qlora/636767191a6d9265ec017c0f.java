import java.util.*;

public class Generated_636767191a6d9265ec017c0f {
    public void enlarge(final int size) {
        if (size > m_data.length) {
            byte[] newData = new byte[size];
            System.arraycopy(m_data, 0, newData, 0, m_data.length);
            m_data = newData;
        }
    }
}