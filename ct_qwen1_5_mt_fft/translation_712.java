import java.util.*;

public class Translation712 {
    public TimerThread(long resolution, Counter counter) {
    super(TIMER_THREAD_NAME);
    this.resolution = resolution;
    this.counter = counter;
    this.isBackground = true;
}
}