public String toString() {
    StringBuilder buffer = new StringBuilder();
    buffer.append("[SERIESLIST]\n");
    buffer.append(" .numSeries =").append(getNumSeries()).append("\n");
    for (int i = 0;
    i < getNumSeries();
    i++) {
        buffer.append(" .series_").append(i).append(" =").append(getSeries(i)).append("\n");
    }
    buffer.append("[/SERIESLIST]\n");
    return buffer.toString();
}