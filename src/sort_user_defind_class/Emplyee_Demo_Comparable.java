package sort_user_defind_class;

import java.util.ArrayList;
import java.util.Collections;

class Emplyee implements Comparable<Emplyee>{
    int Emp_ID;
    String EMP_Name;
    int EMP_MGR_ID;
    
    public Emplyee(int Emp_ID, String EMP_Name ,  int EMP_MGR_ID) {
        // TODO Auto-generated constructor stub
        this.Emp_ID = Emp_ID;
        this.EMP_Name = EMP_Name;
        this.EMP_MGR_ID=EMP_MGR_ID;
    }

    @Override
    public int compareTo(Emplyee o) {
        // TODO Auto-generated method stub
        return this.Emp_ID -o.Emp_ID;
    }  
    
}

public class Emplyee_Demo_Comparable {
    public static void main(String[] args) {
        ArrayList<Emplyee> al = new ArrayList<Emplyee>();
        al.add(new Emplyee(1,"Harish9", 55));
        al.add(new Emplyee(5,"Harish2", 60));
        al.add(new Emplyee(6,"Harish4", 41));
        al.add(new Emplyee(2,"Harish7", 12));
        al.add(new Emplyee(4,"Harish3", 85));
        al.add(new Emplyee(3,"Harish1", 63));
        
       System.out.println("DAta is as below");
       for(Emplyee all:al){
           System.out.println(all.Emp_ID+" "+all.EMP_Name+" "+all.EMP_MGR_ID);
       } 
       
       System.out.println("\nafter Sorting based on the EMP_ID");
       Collections.sort(al);
       for(Emplyee all:al){
           System.out.println(all.Emp_ID+" "+all.EMP_Name+" "+all.EMP_MGR_ID);
       } 
       
    }
}
