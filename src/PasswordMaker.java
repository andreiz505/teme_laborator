public class PasswordMaker {
    private static final PasswordMaker instance;
    private static int count = 0;

    static {
        instance = new PasswordMaker();
    }

    private PasswordMaker() {
    }

    public static PasswordMaker getInstance() {
        count++;
        return instance;
    }

    public static int getCallingCounts() {
        return count;
    }

    public String getPassword() {
        return "pass" + (int)(Math.random() * 1000);
    }
}