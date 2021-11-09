import org.testng.annotations.Test;

public class FirstExample {
    @Test
    public void testName() {
        System.out.println("Hello Portnov School!");
    }
    @Test
    public void testPrint() {
        System.out.println("Hello World!");
    }
    @Test
    public void testNumbers() {
        int numberOfClicks = 5;
        int anotherNumber;
        anotherNumber = 6 + numberOfClicks;
        System.out.println(anotherNumber);
    }
    @Test
    public void testMoreNumbers() {
        int numberOfClicks = 5;
        int anotherNumber = 5;
        System.out.println(5 + 6 + anotherNumber);
    }
    @Test
    public void testString() {
        String leftPartMessage = "Who who who who!";
        String rightPartMessage = "Who let the dogs out!";

        System.out.println(rightPartMessage + " " + leftPartMessage);
    }

    public void printClickMessage(int firstNumber, int secondNumber) {
        String messagePrefix = "FirstNumber value is:";
        String messagePostfix = "secondNumber value is:";

        System.out.println(messagePrefix + firstNumber+ "\n " + messagePostfix + secondNumber);
    }
    @Test
    public void testMyMethod() {
        printClickMessage(1, 2);
    }
    @Test
    public void testArrays() {
        int[] arrayOfInts = {1, 2, 3, 4, 5};
        arrayOfInts[2] = 4;
        System.out.println(arrayOfInts[2]);
    }
    @Test
    public void testForLoop() {
        int[] arrayOfInts = {1, 2, 3, 4, 5};

        for (int i = 1; i < arrayOfInts.length - 1; i++) {
            System.out.println(arrayOfInts[i]);
        }

    }



}
