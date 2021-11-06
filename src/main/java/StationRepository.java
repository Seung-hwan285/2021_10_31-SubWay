import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {

    /**
     * 지하철역
     * 1. 교대,강남,역삼,남부터미널,양재,양재시민,매봉 -> enum
     * 2. 지하철 역을 등록하고 삭제할 수 있다
     * 3. 지하철 역의 목록을 조회 할 수 있다
     * 4. 중복된 지하철 역 이름이 등록될 수 없다
     * 5. 역 이름 2글자 제한
     * 6. 역 비어있는지 체크
     *
     */

    public static final List<Station> stations=new ArrayList<>();


    public static List<Station> retrieveStation(){
        return Collections.unmodifiableList(stations);
    }


    public static boolean isEmptyStation(List<Station> stationList){
        if(stationList.isEmpty()){
            return true;
        }
        return false;
    }

    // 2. 지하철 역을 등록
    public static void addStation(Station station){
        stations.add(station);

        // 추가한 역 이름 출력

    }

    // 2. 지하철 역을 삭제
    public static boolean deleteStation(String name){
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }

    // 3. 지하철 역의 목록을 조회한다
    public static void printStation(){
        for(Station s: stations){
            System.out.println(s.getName());
        }
    }


    public static void printStationList(List<Station> stationList){
        System.out.println("역 목록");
        for(int i=0; i<stationList.size(); i++){
            System.out.println(stationList.get(i).getName());
        }
    }
    // 4. 중복된 지하철 역 이름이 등록될 수 있다
    public static boolean isDuplicate(String name){
        if(!retrieveStation().contains(name)){
            return false;
        }
        return true;
    }

    //5. 역글자 제한
    public static boolean checkNameLen(String name){
        return name.length() >=2;
    }





}
