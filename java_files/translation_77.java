public String getHumanishName() {
    if (getPath().equals("")) {
        throw new IllegalArgumentException();
    }
    String s = getPath();
    String[] elements = split(s);
    if (elements.length == 0) {
        throw new IllegalArgumentException();
    }
    String result = elements[elements.length - 1];
    if (result.endsWith(".git")) {
        result = s.substring(0, s.length() - 3);
    }
    else if (result.equals("objects")) {
        result = s.substring(0, s.length() - 1);
    }
    return result;
}