class MethodOver {
    void show() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Delhi is an important city");
        }
    }

    void show(String s) {
        for (int i = 0; i < 3; i++) {
            System.out.println(s);
        }
    }

    void show(String s, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }
}

public class MethodOverload {
    public static void main(String args[]) {
        MethodOver o = new MethodOver();
        o.show();
        o.show("Bombay is a beautiful city");
        o.show("chennai is a peacful city", 4);
    }
}
