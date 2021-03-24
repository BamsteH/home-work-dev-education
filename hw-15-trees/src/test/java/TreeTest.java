import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;

@RunWith(Parameterized.class)
public class TreeTest {

    private final String name;

    private final ITree actualTree;

    private final ITree expectedTree;

    public TreeTest(String name, ITree actualTree, ITree expectedTree) {
        this.name = name;
        this.actualTree = actualTree;
        this.expectedTree = expectedTree;
    }

    @Parameterized.Parameters(name = "{index} {0}")
    public static Collection<Object> instances(){
        return Arrays.asList(new Object[][]{
                {"Binary tree", new BinaryTree(), new BinaryTree()},
                {"AVL tree", new AVLTree(), new AVLTree()}
        });
    }

    @Before
    public void setUp(){
        actualTree.clear();
        expectedTree.clear();
    }

    //=================================================
    //============== Init + To array ==================
    //=================================================

    @Test(expected = NullPointerException.class)
    public void initNull(){
        actualTree.init(null);
    }

    @Test
    public void initZero(){
        int[] array = new int[0];
        actualTree.init(array);
        int[] exp = {};
        int[] act = actualTree.toArray();
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void initOne(){
        int[] array = {0};
        actualTree.init(array);
        int[] exp = {0};
        int[] act = actualTree.toArray();
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void initTwo(){
        int[] array = {1, 0};
        actualTree.init(array);
        int[] exp = {0, 1};
        int[] act = actualTree.toArray();
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void initThree(){
        int[] array = {1, 0, 2};
        actualTree.init(array);
        int[] exp = {0, 1, 2};
        int[] act = actualTree.toArray();
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void initMany(){
        int[] array = {1, 0, 2, 3, 5, 4, 8, 6, 5, 9};
        actualTree.init(array);
        int[] exp = {0, 1, 2, 3, 4, 5, 6, 7 ,8 ,9};
        int[] act = actualTree.toArray();
        Assert.assertArrayEquals(exp, act);
    }

    @Test
    public void initManySame(){
        int[] array = {0, 1, 2, 0, 1, 0, 2, 1, 1, 2, 0, 2};
        actualTree.init(array);
        int[] exp = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2};
        int[] act = actualTree.toArray();
        Assert.assertArrayEquals(exp, act);
    }

    //=================================================
    //=================== Clear =======================
    //=================================================

    @Test
    public void clearZero(){
        int[] array = new int[0];
        actualTree.init(array);
        actualTree.clear();
        expectedTree.init(new int[0]);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void clearOne(){
        int[] array = {0};
        actualTree.init(array);
        actualTree.clear();
        expectedTree.init(new int[0]);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void clearTwo(){
        int[] array = {1, 0};
        actualTree.init(array);
        actualTree.clear();
        actualTree.clear();
        expectedTree.init(new int[0]);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void clearThree(){
        int[] array = {1, 0, 2};
        actualTree.init(array);
        actualTree.clear();
        actualTree.clear();
        expectedTree.init(new int[0]);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void clearMany(){
        int[] array = {1, 0, 2, 3, 5, 4, 8, 6, 5, 9};
        actualTree.init(array);
        actualTree.clear();
        expectedTree.init(new int[0]);
        Assert.assertEquals(expectedTree, actualTree);
    }

    //=================================================
    //=================== Size ========================
    //=================================================

    @Test
    public void sizeZero(){
        int[] array = new int[0];
        actualTree.init(array);
        int exp = 0;
        int act = actualTree.size();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void sizeOne(){
        int[] array = {0};
        actualTree.init(array);
        int exp = 1;
        int act = actualTree.size();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void sizeTwo(){
        int[] array = {1, 0};
        actualTree.init(array);
        int exp = 2;
        int act = actualTree.size();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void sizeThree(){
        int[] array = {1, 0, 2};
        actualTree.init(array);
        int exp = 3;
        int act = actualTree.size();
        Assert.assertEquals(exp, act);
    }

    @Test
    public void sizeMany(){
        int[] array = {1, 0, 2, 3, 5, 4, 8, 6, 5, 9};
        actualTree.init(array);
        int exp = 10;
        int act = actualTree.size();
        Assert.assertEquals(exp, act);
    }

    //=================================================
    //=================== Add =========================
    //=================================================

    @Test
    public void addZero(){
        int[] initialArray = {};
        int[] expectedArray = {0};
        actualTree.init(initialArray);
        actualTree.add(0);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void addOne(){
        int[] initialArray = {0};
        int[] expectedArray = {0, 1};
        actualTree.init(initialArray);
        actualTree.add(1);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void addOneSame(){
        int[] initialArray = {0};
        int[] expectedArray = {0, 0};
        actualTree.init(initialArray);
        actualTree.add(0);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void addTwo(){
        int[] initialArray = {0, 1};
        int[] expectedArray = {0, 1, 2};
        actualTree.init(initialArray);
        actualTree.add(2);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void addTwoSame(){
        int[] initialArray = {0, 0};
        int[] expectedArray = {0, 0, 0};
        actualTree.init(initialArray);
        actualTree.add(0);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void addThree(){
        int[] initialArray = {0, 1, 2};
        int[] expectedArray = {0, 1, 2, 3};
        actualTree.init(initialArray);
        actualTree.add(3);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void addThreeSame(){
        int[] initialArray = {0, 0, 0};
        int[] expectedArray = {0, 0, 0, 0};
        actualTree.init(initialArray);
        actualTree.add(3);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void addMany(){
        int[] initialArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        actualTree.init(initialArray);
        actualTree.add(10);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void addManySame(){
        int[] initialArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] expectedArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        actualTree.init(initialArray);
        actualTree.add(10);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void addNegative(){
        int[] initialArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = {-10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        actualTree.init(initialArray);
        actualTree.add(-10);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    //=================================================
    //================== Delete =======================
    //=================================================

    @Test(expected = NoSuchElementException.class)
    public void deleteZero(){
        int[] initialArray = {};
        actualTree.init(initialArray);
        actualTree.delete(10);
    }

    @Test
    public void deleteOne(){
        int[] initialArray = {0};
        int[] expectedArray = {};
        int elementToDelete = 0;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test(expected = NoSuchElementException.class)
    public void deleteNoSuchElementOne(){
        int[] initialArray = {0};
        int elementToDelete = 2;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
    }

    @Test
    public void deleteTwoFirst(){
        int[] initialArray = {0, 1};
        int[] expectedArray = {1};
        int elementToDelete = 0;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteTwoSecond(){
        int[] initialArray = {0, 1};
        int[] expectedArray = {0};
        int elementToDelete = 1;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteTwoSame(){
        int[] initialArray = {0, 0};
        int[] expectedArray = {};
        int elementToDelete = 0;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test(expected = NoSuchElementException.class)
    public void deleteTwoNoSuchElement(){
        int[] initialArray = {0, 1};
        int elementToDelete = 10;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
    }

    @Test
    public void deleteThreeFirst(){
        int[] initialArray = {0, 1, 2};
        int[] expectedArray = {1, 2};
        int elementToDelete = 0;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteThreeSecond(){
        int[] initialArray = {0, 1, 2};
        int[] expectedArray = {0, 2};
        int elementToDelete = 1;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteThreeThird(){
        int[] initialArray = {0, 1, 2};
        int[] expectedArray = {0, 1};
        int elementToDelete = 2;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteThreeSameTwo(){
        int[] initialArray = {0, 0, 2};
        int[] expectedArray = {2};
        int elementToDelete = 0;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteThreeSameThree(){
        int[] initialArray = {0, 0, 0};
        int[] expectedArray = {};
        int elementToDelete = 0;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteManyFirst(){
        int[] initialArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int elementToDelete = 0;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteManyFirstHalf(){
        int[] initialArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = {0, 1, 3, 4, 5, 6, 7, 8, 9};
        int elementToDelete = 2;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteManyMiddle(){
        int[] initialArray = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedArray = {0, 1, 2, 3, 5, 6, 7, 8};
        int elementToDelete = 4;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteManySecondHalf(){
        int[] initialArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = {0, 1, 2, 3, 4, 5, 6, 8, 9};
        int elementToDelete = 7;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

    @Test
    public void deleteManyLast(){
        int[] initialArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = {0, 1, 2, 3, 4, 5, 7, 6, 8};
        int elementToDelete = 9;
        actualTree.init(initialArray);
        actualTree.delete(elementToDelete);
        expectedTree.init(expectedArray);
        Assert.assertEquals(expectedTree, actualTree);
    }

}
