public class operationImpl implements operation{

    @Override
    public String read() {
        System.out.println("read method invoked");
        return "read";
    }

    @Override
    public void write() {
        System.out.println("write method invoked");        
    }

    @Override
    public boolean updateOp(int line, String sentence) {
        System.out.println("update method invoked ");        
        return true;
    }

    @Override
    public void deleteOp(int line) {
        System.out.println("delete method invoked");        
        
    }
    
}
