public class sorting {
    public static void main(String[] args) {
        int temp;
        int[] num = {3,9,8,5,1,4,6,2,7,0};
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num.length - 1;j++)
            {
                if(num[j]>num[i])
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
