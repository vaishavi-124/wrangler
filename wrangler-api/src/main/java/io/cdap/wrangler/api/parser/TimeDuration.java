public class TimeDuration extends Token {
    private long valueInNanoseconds;

    public TimeDuration(String token) {
        // Parse token like "150ms" and convert to nanoseconds
        this.valueInNanoseconds = parseTimeDuration(token);
    }

    private long parseTimeDuration(String token) {
        // Parse the time duration and convert to nanoseconds
        // Implement logic to handle units like ms, s, etc.
    }

    public long getNanoseconds() {
        return valueInNanoseconds;
    }
}
