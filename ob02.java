package object;

import java.sql.Driver;

public class ob02 {
    public int job;
    public String Name;
    private int salery;

    public static void main(String[] args) {
        ob02 obje = new ob02();
        obje.job = 5;
        obje.Name= "computer sale";
        obje.salery= 12000;

        System.out.println("jon:"+obje.job+"\n name:"+obje.Name+"\n salery:"+obje.salery );




    }
}
