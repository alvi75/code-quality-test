public CharBuffer decode(ByteBuffer buffer) {
    try {
        return newDecoder().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(buffer);
    }
    catch (CharacterCodingException ex) {
        throw new Error(ex.getMessage(), ex);
    }
}