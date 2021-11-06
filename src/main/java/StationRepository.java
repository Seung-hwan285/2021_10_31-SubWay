import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class StationRepository {

    /**
     * 지하철역
     *
     * 1. 지하철 역을 등록하고 삭제할 수 있다
     * 2. 지하철 역의 목록을 조회 할 수 있다
     * 3. 중복된 지하철 역 이름이 등록될 수 없다
     * 4. 역 이름 2글자 제한
     * 5. 역 비어있는지 체크
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

        // 중복체크
        // 리스트에 값이 없으면 추가
        if (!isDuplciate(station.getName()) && checkNameLen(station.getName())) {
            stations.add(station);
        }

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
    public static boolean isDuplciate(String name){
        for(Station s: stations){
            //중복있음
            if(s.getName().contains(name)){
                System.out.println(name+"지하철 역 중복 이름 입니다.");
                return true;
            }
        }
        //중복없음
        return false;
    }

    //5. 역글자 제한
    public static boolean checkNameLen(String name){

        if (name.length() >= 3){
            System.out.println("글자수 2이하로 맞춰주세요");
            return false;
        }
        return true;
    }

}
