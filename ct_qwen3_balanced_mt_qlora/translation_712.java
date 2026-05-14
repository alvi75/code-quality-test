import java.util.*;

public class Translation712 {
    2 public TimerThread(final long resolution, final Counter counter) {
    super(TIMER_THREAD_NAME);
    this.resolution = resolution;
    this.counter = counter;
    this.setDaemon(true);
}
}