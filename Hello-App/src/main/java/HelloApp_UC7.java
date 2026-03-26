public class HelloApp_UC7 {

    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("No arguments provided. Please enter names.");
            return;
        }

        // Loop through all command-line arguments
        for (String name : args) {
            System.out.println("Hello, " + name);
        }
    }
}