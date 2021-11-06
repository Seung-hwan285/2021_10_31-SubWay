import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SubwayMangement {

    /**
     *
     * 화면 출력 기능
     *
     * 1. strat메소드 번호 선택  -> printMainScreen 처음에 나오게 ,사용자 입력
     * 2. 각 번호에 대한 기능
     *
     */


    private StationRepository stationRepository;
    private static final printScreen printScreen=new printScreen();
    private  Station station;

    private final Scanner sc=new Scanner(System.in);
    public static List<Station> stations=new ArrayList<>();

    public SubwayMangement(){

    }
    public SubwayMangement(Station station, StationRepository stationRepository) {
        this.station = station;
        this.stationRepository = stationRepository;
    }

    //1. strat메소드 번호 선택  -> printMainScreen 처음에 나오게 ,사용자 입력
    public void start(){
        printScreen.mainPrint();
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
            }

            else if(name.equals("2")){
                System.out.println("## 삭제할 역 이름을 입력하세요");
                name=sc.nextLine();
                StationRepository.deleteStation(name);
            }

            else if(name.equals("3")){
                    System.out.println("## 역 목록");
                    // 역 목록 추가

                    if (stationRepository.isEmptyStation(stationRepository.retrieveStation())){
                        System.out.println("역이 비어있습니다.");
                    }
                    stationRepository.printStationList(stationRepository.retrieveStation());
            }
            // 홈으로
            else if(name.equals("B")){
                start();
            }

            // 1,2,3,B외에 다른 값이 들어오면 예외처리
            else {
                throw new IllegalArgumentException("알맞은 번호를 입력해주세요");
                }
            }

            if(name.equals("2")){
                printScreen.printLineManagementScreen();
                name=sc.nextLine();
                // 노션 등록
                if(name.equals("1")){
                    System.out.println("## 등록할 노션 이름을 입력하세요");
                    name=sc.nextLine();
                    System.out.println("## 등록할 노선의 상행 종점역 이름을 입력하세요");
                    name=sc.nextLine();
                }
            }
        }
    }



