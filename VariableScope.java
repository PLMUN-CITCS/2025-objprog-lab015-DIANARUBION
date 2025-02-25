public class VariableScope {
    // Global variable declared outside any method
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print globalCount from the main method
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call the showScope method to print both global and local counts
        showScope();
    }

    // Method to demonstrate variable scope
    public static void showScope() {
        // Local variable, accessible only within showScope
        int localCount = 50;
        System.out.println("Global Count (from showScope): " + globalCount);
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
