public class Input {

    static String[] testInputs = {"Hallo", "Hi", "Servus", "Hallo Welt", "Hallo!"};
    static int counter = 0;

    private static String returnString;
    public static void setReturnString(String s) {
        returnString = s;
    }

    public static String readString(String dummy) {
        if (counter >= testInputs.length) {
            counter = 0;
        }
        return testInputs[counter++];
    }
}
