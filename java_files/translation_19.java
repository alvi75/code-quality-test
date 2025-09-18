public NotImplementedFunctionException(String functionName, RuntimeException cause) {
    super(functionName);
    this.cause = cause;
}