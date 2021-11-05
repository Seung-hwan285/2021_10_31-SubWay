import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubwayMangement {

    /**
     *
     * 화면 출력 기능
     *
     * 1. strat메소드 번호 선택  -> printMainScreen 처음에 나오게 ,사용자 입력
     * 2. 각 번호에 대한 기능
     */


    private StationRepository stationRepository;
    private static final printScreen printScreen=new printScreen();
    private  Station station;
    private User user;
    private final Scanner sc=new Scanner(System.in);
    private List<Station> stationList=new ArrayList<>();
    public SubwayMangement(){

    }
    public SubwayMangement(Station station, StationRepository stationRepository) {
        this.station = station;
        this.stationRepository = stationRepository;
    }

    //1. strat메소드 번호 선택  -> printMainScreen 처음에 나오게 ,사용자 입력
    public void start(){
        System.out.println("## 메인 화면");
        System.out.println("1. 역 관리");
        System.out.println("2. 노션 관리");
        System.out.println("3. 구간 관리");
        System.out.println("4. 지하철 노선도 출력력");
        String name=sc.nextLine();
        mainFunction(name);
    }

    //2. 각 번호에 대한 기능
    void mainFunction(String name){
        // 역등록,역조회 역삭제,돌아가기
        if(name.equals("1")){
            printScreen.printStationManagementScreen();
            name=sc.nextLine();
            // 1번은 역 등록
            if(name.equals("1")){
                    System.out.println("## 등록할 역 이름을 입력하세요.");
                    // 지하철역 추가
                    name=sc.nextLine();
                    StationRepository.addStation(new Station(name));
                    return;
                }
            }
        printScreen.printStationList(stationList);
        }

    }



