import java.util.*;

public class Generated_636767e11a6d9265ec018781 {
    @Pure
	@Override
	public void accept(final METRICS data) {
		final String id = data.getId();
		if (id == null || id.isEmpty()) {
			return;
		}
		synchronized (this.buffer) {
			final METRICS oldData = this.buffer.get(id);
			if (oldData != null) {
				METRICS newData = oldData.combine(data);
				if (newData == null) {
					this.buffer.remove(id);
				} else {
					this.buffer.put(id, newData);
				}
			} else {
				this.buffer.put(id, data);
			}
		}
	}
}