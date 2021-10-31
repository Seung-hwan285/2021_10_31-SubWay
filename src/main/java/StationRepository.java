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
     * 5. 역 이름 
     *
     */

    private static final List<Station> stations=new ArrayList<>();

    public static List<Station> stations(){
        return Collections.unmodifiableList(stations);
    }

    // 2. 지하철 역을 등록하고 삭제할 수 있다
    public static void addStation(Station station){
        stations.add(station);
    }

    // 2. 지하철 역을 등록하고 삭제할 수 있다
    public static boolean deleteStation(String name){
        return stations.removeIf(station -> Objects.equals(station.getName(), name));
    }


    //3. 지하철 역의 목록을 조회 할 수 있다
    public static void printStation(){
        for(Station station: stations){
            System.out.println(station.getName());
        }
    }

    // 4. 중복된 지하철 역 이름이 등록될 수 없다
    public static boolean isDuplicate(String name,List<Station> stations){
        for(Station station: stations){
            if(station.getName().equals(name));
            return false;
        }
        return true;
    }


}
