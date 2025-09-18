public void setQuery(String query) {
    this.query = query;
    setQueryNodeProcessorPipeline(createQueryConfigHandler());
}