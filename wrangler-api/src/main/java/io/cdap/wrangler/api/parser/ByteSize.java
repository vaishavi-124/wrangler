public class ByteSize extends Token {
    private long valueInBytes;

    public ByteSize(String token) {
        // Parse token like "10KB" and convert to bytes
        this.valueInBytes = parseByteSize(token);
    }

    private long parseByteSize(String token) {
        // Parse the size and convert to bytes
        // Implement logic to handle units like KB, MB, etc.
    }

    public long getBytes() {
        return valueInBytes;
    }
}
