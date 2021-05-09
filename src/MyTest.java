public class MyTest {

    @BeforeSuite
    public static void BeforeSuite(){
        System.out.println("BeforeSuite");
    }

    @Test
    public static void test1(){
        System.out.println("Test#1");
    }

    @Test
    public static void test2(){
        System.out.println("Test#2");
    }

    @Test(priority = 3)
    public static void test3(){
        System.out.println("Test#3");
    }

    @Test(priority = 9)
    public static void test4(){
        System.out.println("Test#4");
    }

    @Test(priority = 1)
    public static void test5(){
        System.out.println("Test#5");
    }

    @AfterSuite
    public static void AfterSuite(){
        System.out.println("AfterSuite");
    }

}
