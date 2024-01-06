package homeworks.hw22;

public class MyTestClass {
    @BeforeSuite
    public void setUp() {
        System.out.println("Підготовка перед виконанням тестів (BeforeSuite)");
    }

    @Test(priority = 1)
    public void testMethodOne() {
        System.out.println("Виконання тесту 1 з пріоритетом 1");
    }

    @Test(priority = 3)
    public void testMethodTwo() {
        System.out.println("Виконання тесту 2 з пріоритетом 3");
    }

    @Test(priority = 2)
    public void testMethodThree() {
        System.out.println("Виконання тесту 3 з пріоритетом 2");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("Прибирання після виконання тестів (AfterSuite)");
    }
}
