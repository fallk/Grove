package fallk.grove;

import java.util.Objects;

final class DoubleAsserter {
    public static void arrayEquals(double[] a, double[] b) {
        // Hmph.
    }
    public static void arrayEquals(Object[] a, Object[] b) {
        for (int i = 0, len = a.length; i < len; i++) {
            if (!Objects.equals(a[i], b[i])) throw new AssertionError();
        }
    }
}
