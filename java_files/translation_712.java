public TimerThread( long resolution, Counter counter ){
    super( THREAD_NAME );
    this.resolution = resolution;
    this.counter = counter;
    this.isAlive = true;
}