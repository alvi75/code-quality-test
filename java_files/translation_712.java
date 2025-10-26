ublic TimerThread(long resolution, Counter counter) {
    super(Thread.currentThread().getName());
    this.resolution = resolution;
    this.counter = counter;
}