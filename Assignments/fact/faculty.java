package Assignments.fact;

import Assignments.stud.student;

public class faculty {

   
    public static void main(String[] args) {
 

    }

    public int getStudentMarks(int rollNum,student[] s1)
    {
        for(int i=0;i<4;i++)
        {
            if(s1[i].getRollNum()==rollNum)
            {
                return s1[i].getMarks();
            
            }
        }
        
        return 0;
    }
}
