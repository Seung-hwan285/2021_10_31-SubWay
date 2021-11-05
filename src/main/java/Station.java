import java.util.ArrayList;
import java.util.Scanner;
public class Station {

    // list가 한개 잇어야함

    private String name;
    private ArrayList<Station> stations=new ArrayList<>();
    private final Scanner sc=new Scanner(System.in);


    public Station(String name){
        this.name=name;
    }


    //사용자 입력
    public String geInput() {
        return sc.nextLine();
    }


    public String getName(){
        return name;
    }



}
