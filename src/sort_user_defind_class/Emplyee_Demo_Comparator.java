package sort_user_defind_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emplyee_Comparator{
    int Emp_ID;
    String EMP_Name;
    int EMP_MGR_ID;
    
    public Emplyee_Comparator(int Emp_ID, String EMP_Name ,  int EMP_MGR_ID) {
        // TODO Auto-generated constructor stub
        this.Emp_ID = Emp_ID;
        this.EMP_Name = EMP_Name;
        this.EMP_MGR_ID=EMP_MGR_ID;
    }    
}
class ID_Comparator implements Comparator<Emplyee_Comparator>{

    @Override
    public int compare(Emplyee_Comparator o1, Emplyee_Comparator o2) {
        // TODO Auto-generated method stub
        if(o1.Emp_ID==o2.Emp_ID){
            return 0;
        }
        else if(o1.Emp_ID>o2.Emp_ID){
            return 1;
        }
        else{
            return -1;
        }
    }
}

class EMP_NameComparator implements Comparator<Emplyee_Comparator>{

    @Override
    public int compare(Emplyee_Comparator o1, Emplyee_Comparator o2) {
        // TODO Auto-generated method stub
        return o1.EMP_Name.compareTo(o2.EMP_Name);
    }    
}

class MGR_ID_Comparator implements Comparator<Emplyee_Comparator>{

    @Override
    public int compare(Emplyee_Comparator o1, Emplyee_Comparator o2) {
        // TODO Auto-generated method stub
        if(o1.EMP_MGR_ID==o2.EMP_MGR_ID){
            return 0;
        }
        else if(o1.EMP_MGR_ID>o2.EMP_MGR_ID){
            return 1;
        }
        else{
            return -1;
        }
    }
}


public class Emplyee_Demo_Comparator {
    public static void main(String[] args) {
        ArrayList<Emplyee_Comparator> al5 = new ArrayList<Emplyee_Comparator>();
        al5.add(new Emplyee_Comparator(1,"Harish9", 55));
        al5.add(new Emplyee_Comparator(5,"Harish2", 60));
        al5.add(new Emplyee_Comparator(6,"Harish4", 41));
        al5.add(new Emplyee_Comparator(2,"Harish7", 12));
        al5.add(new Emplyee_Comparator(4,"Harish3", 85));
        al5.add(new Emplyee_Comparator(3,"Harish1", 63));
        
       System.out.println("DAta is as below");
       for(Emplyee_Comparator all:al5){
           System.out.println(all.Emp_ID+" "+all.EMP_Name+" "+all.EMP_MGR_ID);
       } 
       
       System.out.println("\nafter Sorting based on the EMP_ID");
       Collections.sort(al5,new ID_Comparator());
       for(Emplyee_Comparator all:al5){
           System.out.println(all.Emp_ID+" "+all.EMP_Name+" "+all.EMP_MGR_ID);
       } 
       
       
       System.out.println("\nafter Sorting based on the EMP_name");
       Collections.sort(al5,new EMP_NameComparator());
       for(Emplyee_Comparator all:al5){
           System.out.println(all.Emp_ID+" "+all.EMP_Name+" "+all.EMP_MGR_ID);
       } 
              
       System.out.println("\nafter Sorting based on the EMP_MGR_ID");
       Collections.sort(al5,new MGR_ID_Comparator());
       for(Emplyee_Comparator all:al5){
           System.out.println(all.Emp_ID+" "+all.EMP_Name+" "+all.EMP_MGR_ID);
       } 
       
       
    }

}
