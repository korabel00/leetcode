package binary_search;

import org.junit.Assert;
import org.junit.Test;

public class FindSmallestLetterGreaterThanTargetTest {

    @Test
    public void testFindSmallestLetterGreaterThanTargetCaseOne() {

        FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();
        char actual = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c','f','j'}, 'a');
        Assert.assertEquals('c', actual);
    }

    @Test
    public void testFindSmallestLetterGreaterThanTargetCaseTwo() {

        FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();
        char actual = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c','f','j'}, 'c');
        Assert.assertEquals('f', actual);
    }

    @Test
    public void testFindSmallestLetterGreaterThanTargetCaseThree() {

        FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();
        char actual = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c','f','j'}, 'd');
        Assert.assertEquals('f', actual);
    }

    @Test
    public void testFindSmallestLetterGreaterThanTargetCaseFour() {

        FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();
        char actual = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c','f','j'}, 'g');
        Assert.assertEquals('j', actual);
    }

    @Test
    public void testFindSmallestLetterGreaterThanTargetCaseFive() {

        FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget = new FindSmallestLetterGreaterThanTarget();
        char actual = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[]{'c','f','j'}, 'j');
        Assert.assertEquals('c', actual);
    }
}
