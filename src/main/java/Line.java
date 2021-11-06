import java.util.LinkedList;
import java.util.List;

public class Line {

    /**
     * 노션
     */
    private String name;
    private String firString;
    private String lasString;

    public Line(String name,String firstStation,String lastStaion){
        this.name=name;
        this.firString=firstStation;
        this.lasString=lastStaion;
    }



    public String getName(){

        return name+" "+firString+" "+lasString;

    }


    private List<Station> stationList=new LinkedList<>();




}
