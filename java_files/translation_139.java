public static TokenFilterFactory forName(String name, Map<String,String> args) {
    return loader.newInstance(name, args);
}