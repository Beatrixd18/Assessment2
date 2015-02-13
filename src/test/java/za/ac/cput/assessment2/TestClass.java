package za.ac.cput.assessment2;

import org.junit.*;


/**
 * Created by student on 2015/02/11.
 */
public class TestClass {
    myApp ap = new myApp();

    //exeecute before class
    @BeforeClass
    public static void beforeClass()
    {

        System.out.println("in before class");
    }

    @Test
    public void testFloat()
    {
        Assert.assertEquals(ap.floatNum(), 30.98, 2);
    }

    @Test
    public void testInt()
    {
        Assert.assertTrue(ap.findInt() == 7);
    }

    @Test
    public void testEquality()
    {
        ap.setName("Bea");

        Assert.assertEquals(ap.getName(), "Bea");
    }

    @Test
    public void testIdentity()
    {
        ap.setName("Bea");
        Assert.assertSame(ap.getName(), "Bea");
    }

    @Test
    public void testTruth()
    {
        Assert.assertTrue(ap.truth());
    }

    @Test
    public void testFalse()
    {
        Assert.assertFalse(ap.fals());
    }

    @Test
    public void testNullness()
    {
        Assert.assertNull(ap.nameNull());
    }

    @Test
    public void testNonNull()
    {
        ap.setName("Bea");
        Assert.assertNotNull(ap.getName());
    }

    @Test
    public void testFailing()
    {
        Assert.fail();
    }

    @Test(timeout = 10)
    public void testTimeOut() throws Exception
    {
        ap.time();
    }

    @Test
    public void testArray()
    {
        String [] n1 = {"Bea", "Welly", "Caiden"};
        String [] n2 = {"Bea", "Welly", "Caiden"};
        //Assert.assertArrayEquals(ap.arrayContent1(), ap.arrayContent2());
        Assert.assertArrayEquals(n1, n2);
    }

    @Ignore
    public void testDisabling()
    {
        System.out.println("in ignore test");
    }


    //execute after class
    @AfterClass
    public static void afterClass()
    {
        System.out.println("in after class");
    }
}
