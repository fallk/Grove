package fallk.grove;

import org.junit.Assert;

final class AssertUtil {
    public static void equals(byte a, byte b) {
        Assert.assertEquals(a, b);
    }
    public static void equals(short a, short b) {
        Assert.assertEquals(a, b);
    }
    public static void equals(int a, int b) {
        Assert.assertEquals(a, b);
    }
    public static void equals(long a, long b) {
        Assert.assertEquals(a, b);
    }
    public static void equals(char a, char b) {
        Assert.assertEquals(a, b);
    }
    public static void equals(float a, float b) {
        Assert.assertEquals(a, b, 0.00001F);
    }
    public static void equals(double a, double b) {
        Assert.assertEquals(a, b, 0.00001D);
    }
    public static void equals(Object a, Object b) {
        Assert.assertEquals(a, b);
    }
}
