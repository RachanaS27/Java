public class threadEx {
  
public static void main(String[] args) {
       Thread t1 = new Thread(new Impl1());
       Thread t2 =  new Thread(new Impl2());

       try {
        t2.start();
        System.out.println("t1 is alive : "+ t1.isAlive()+" t2 is alive : "+ t2.isAlive());
        Thread.sleep(1000);
        System.out.println("t1 state "+t1.getState()+" t2 state "+t2.getState()); 
        t1.join();
        t1.start();
        String name1 = t1.getName();
        String name2 = t2.getName();
        System.out.println(" t1 name "+name1+" t2 name "+name2);
       
       } catch (InterruptedException e) {
           System.out.println("Something went wrong");
           e.printStackTrace();
        }
   } 
}

class Impl1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("hello "+i);
        }        
    }

}
class Impl2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("hi "+i);
        }        
    }

}