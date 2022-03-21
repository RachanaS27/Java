public interface operation {
    public String read();
    public void write();
    public boolean updateOp(int line,String sentence);
    public void deleteOp(int line);
}
