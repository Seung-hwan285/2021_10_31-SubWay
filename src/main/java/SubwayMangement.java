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


    public SubwayMangement(){

    }
    public SubwayMangement(Station station, StationRepository stationRepository) {
        this.station = station;
        this.stationRepository = stationRepository;
    }

    //1. strat메소드 번호 선택  -> printMainScreen 처음에 나오게 ,사용자 입력
    public void start(){
        printScreen.printMainScreen();
        mainFunction(station.geInput());
    }

    //2. 각 번호에 대한 기능
    void mainFunction(String num){
        // 역등록,역조회 역삭제,돌아가기
        if(num.equals("1")){
            printScreen.printStationManagementScreen();
            // 1번은 역 등록
            if(num.equals("1")){
                printScreen.printInputStationName();
                // 지하철역 추가
                StationRepository.addStation(new Station(station.geInput()));
                return;
            }
        }
    }


}
