public class arrayExample {
    public static void main(String[] args) {
        int[] number = new int[10];
        number[0]=10;
        number[1]=20;
        System.out.println(number[0]);
        System.out.println(number[5]);
        try {
            System.out.println(number[12]);
        } catch (Exception e) {
            System.out.println("Array length is 10");
        }
        number[2]=30;
        System.out.println(number[2]);
        
        char[] ch = {'a','b','c'};
        System.out.println(ch[1]);
        
        float[] decimal = new float[]{1.2f,3.2f,5.4f,6.78f};
        for(int i=0;i<decimal.length;i++)
        {
            System.out.print(decimal[i]+" ,");
        }
    }
}
