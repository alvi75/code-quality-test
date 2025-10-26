ublic void setDate(java.util.Date date) {
    if (date != null) {
        setDate(DateTools.toISO8601String(date));
    }
    else {
        this.date = null;
    }
}