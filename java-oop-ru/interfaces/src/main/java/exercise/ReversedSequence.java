package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private String seq;

    public ReversedSequence(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        seq = sb.toString();
    }

    @Override
    public int length() {
        return seq.length();
    }

    @Override
    public char charAt(int place) {
        return seq.charAt(place);
    }

    @Override
    public String subSequence(int start, int end) {
        return seq.substring(start, end);
    }

    public String toString() {
        return seq;
    }
}
// END
