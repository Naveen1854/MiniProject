class FinalVariable {
    final int a = 10;

    void show() {
        System.out.print(a);
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable();
        fv.show();
    }
}
