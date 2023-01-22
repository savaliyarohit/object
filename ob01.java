package object;

import org.omg.CORBA.OBJ_ADAPTER;

public class ob01 {
      public int House;
      public String Name;
      private int Rent;



    public static void main(String[] args) {
      ob01 object = new ob01();
      object.House= 1;
      object.Name = "Ramvila";
      object.Rent = 15000;

           System.out.println("House:"+object.House + "\n Name:"+object.Name +" \n Rant:"+object.Rent );

    }
}
