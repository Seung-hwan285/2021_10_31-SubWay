import java.util.Scanner;
public class Station {

    StationRepository stationRepository=new StationRepository();


    public Station(){
        System.out.println("## 역 관리 화면");

        System.out.println("1.역 등록");
        System.out.println("2.역 삭제");
        System.out.println("3.역 조회");
        System.out.println("B.돌아가기");

    }

    private String name;

    public Station(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }



}
