import java.util.ArrayList;
import java.util.Scanner;
public class Station {

    /**
     * 사용자 입력
     * 1. 사용자 입력 (번호,역 이름)
     */

    private String name;
    private ArrayList<Station> stations=new ArrayList<>();
    private final Scanner sc=new Scanner(System.in);


    public Station(String name){
        this.name=name;
    }

    // 역이름 반환
    public String getName(){
        return name;
    }



}
