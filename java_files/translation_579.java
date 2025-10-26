ublic boolean handles(String commandLine) {
    return command.length() + 1 < commandLine.length() && commandLine.charAt(command.length()) == ' ' && commandLine.startsWith(command);
}