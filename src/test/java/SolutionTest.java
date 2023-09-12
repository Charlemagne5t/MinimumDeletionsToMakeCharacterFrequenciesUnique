import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void minDeletionsTest1() {
        String s = "aab";
        int expected = 0;
        int actual = new Solution().minDeletions(s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minDeletionsTest2() {
        String s = "aaabbbcc";
        int expected = 2;
        int actual = new Solution().minDeletions(s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minDeletionsTest3() {
        String s = "ceabaacb";
        int expected = 2;
        int actual = new Solution().minDeletions(s);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void minDeletionsTest4() {
        String s = "bbcebab";
        int expected = 2;
        int actual = new Solution().minDeletions(s);

        Assert.assertEquals(expected, actual);
    }

}
