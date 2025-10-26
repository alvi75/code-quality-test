ublic void setBaseline(long clockTime) {
    t0 = clockTime;
    timeout = t0 + ticksAllowed;
}