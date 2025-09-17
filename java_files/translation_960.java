public StandardQueryNodeProcessorPipeline(QueryNodeProcessorPipeline child) {
    super(child);
    for (int i = 0 ;
    i < child.size() ;
    i++) {
        if (child.get(i).getClass().equals(BooleanQuery2ModifierNodeProcessor.class)) {
            remove(i--);
        }
    }
    add(new BooleanModifiersQueryNodeProcessor());
}