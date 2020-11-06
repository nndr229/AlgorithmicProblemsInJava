package DiffHeadTail;

public class HeadTail {
    public static void main(String[] args) {
        System.out.println("Tail Recursion");
        buildLayerTail(5);
        System.out.println();
        System.out.println("Head Recursion");
        buildLayerHead(5);
    }

    // Head Recursion
    public static void buildLayerHead(int height) {
        if (height == 0)
            return;
        buildLayerHead(height - 1);
        System.out.println(height);

    }

    // Tail Recursion
    public static void buildLayerTail(int height) {
        if (height == 0)
            return;
        System.out.println(height);
        buildLayerTail(height - 1);
    }
}
