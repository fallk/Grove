package fallk.grove;

import java.util.Objects;

final class ByteAsserter {
    public static void arrayEquals(byte[] a, byte[] b) {
        for (int i = 0, len = a.length; i < len; i++) {
            if (a[i] != b[i]) throw new AssertionError();
        }
    }
    public static void arrayEquals(Object[] a, Object[] b) {
        for (int i = 0, len = a.length; i < len; i++) {
            if (!Objects.equals(a[i], b[i])) throw new AssertionError();
        }
    }
}
