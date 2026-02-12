public class startriangle {
    private int width;

    public startriangle(int width) {
        this.width = width;
    }


    public String toString() {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < i; j++) {
                result.append("[*]");
            }
            result.append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        startriangle small = new startriangle(5);
        System.out.println(small.toString());
    }
}