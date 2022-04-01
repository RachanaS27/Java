public interface LambdaEx {
    String speak();
}

class A implements LambdaEx{

    @Override
    public String speak() {
        System.out.println("A is speaking..");
        return "hi";
    }
    public static void main(String[] args) {
        LambdaEx l1 = new A();
        l1.speak();
     

    }

  
   
}

class B {
    
    public static void main(String[] args) {
       LambdaEx l1 = new LambdaEx() {

            @Override
            public String speak() {
               System.out.println("B is speaking in anonymous inner class");
               return "i";
            }
            
        };
        l1.speak();
        LambdaEx l2 = ()->{
            System.out.println("B is speaking in lambda");
            return "yes";
        };
        l2.speak();

        LambdaEx l3 = ()->"hello every one";
        System.out.println(l3.speak());

        
    }
   
    
}
