import org.junit.Assert;
import org.junit.Test;

public class RemoveParenthesesTest {

    @Test
    public void testRemoveParentheses(){
        Assert.assertEquals("  ", RemoveParentheses.removeParentheses("(first group) (second group) (third group)"));
        Assert.assertEquals("a", RemoveParentheses.removeParentheses("a(b(c))"));
        Assert.assertEquals("hello example  something", RemoveParentheses.removeParentheses("hello example (words(more words) here) something"));
        Assert.assertEquals("exampleexample", RemoveParentheses.removeParentheses("example(unwanted thing)example"));
        Assert.assertEquals("example  example", RemoveParentheses.removeParentheses("example (unwanted thing) example"));
        Assert.assertEquals("a e", RemoveParentheses.removeParentheses("a (bc d)e"));
    }
}