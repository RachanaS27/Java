package Assignments;

public class circle implements printable,sortable{

    int radius;
    int diameter;
    String color;

    public circle() {
    }

    public circle(int radius, int diameter, String color) {
        this.radius = radius;
        this.diameter = diameter;
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Circle class print method"); 
        System.out.println(this.radius+" "+this.diameter+" "+this.color);       
    }

    @Override
    public void sortAll() {
        int[] num = {3,2,5,1,4};
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
