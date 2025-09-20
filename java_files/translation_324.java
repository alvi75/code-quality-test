import java.util.*;

public class Translation324 {
    public void resize(int newSize) {
    if (newSize < 0)throw new System.ArgumentException();
    if (m_size == newSize)return;
    int oldSize = m_size;
    if (oldSize > newSize){
        Array.Copy(m_data, 0, m_data, 0, oldSize);
    }
    m_size = newSize;
}
}