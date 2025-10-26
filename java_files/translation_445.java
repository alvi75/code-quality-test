ublic void run() {
    try {
        this._enclosing.doRefreshProgress(this.mId, this.mProgress, this.mFromUser, true);
        this._enclosing.mRefreshProgressRunnable = this;
    }
    catch (Exception e) {
        Log.e(TAG, "Error refreshing progress", e);
    }
}