package Assignments;

public class sortInterface implements sortable{

    int[] num;
    public sortInterface(int[] num)
    {
        this.num = num;
    }
    public static void main(String[] args) {
        int[] n1 = {3,2,5,1,4};
        sortInterface si = new sortInterface(n1);
        si.sortAll();
    }


    @Override
    public void sortAll() {
        int temp;
       
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
    

