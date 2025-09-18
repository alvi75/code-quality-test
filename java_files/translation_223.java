public char requireChar(Map<String,String> args, String name) {
    String s = require(args, name);
    if (s.length() != 1) {
        throw new IllegalArgumentException(name + " should be a char. \"" + s + "\" is invalid");
    }
    return s.charAt(0);
}