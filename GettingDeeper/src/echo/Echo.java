package echo;

public class Echo {
    public static void main(String[] args) {
        int firstArgs;
        if (args.length > 0) {
            try {
                firstArgs = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("[Argument: " + args[0] + "] must be an integer.");
                System.exit(1);
            }
        }
        for (String s: args) {
            System.out.println(s);
        }
    }
}
