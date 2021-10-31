import java.util.ArrayList;
import java.util.Scanner;
public class Station {

    // list가 한개 잇어야함

    private String name;
    private ArrayList<Station> stations=new ArrayList<>();


    public Station(String name){
        this.name=name;
    }


    public String getName(){
        return name;
    }



}
