public class operationMain {
    public static void main(String[] args) {
        operationImpl op = new operationImpl();
        op.read();
        op.write();
        op.deleteOp(3);
        op.updateOp(2, "welcome");
    }
}
