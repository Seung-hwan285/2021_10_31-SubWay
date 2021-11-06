import java.util.List;

public class printScreen {
    public static void mainPrint(){
        System.out.println("## 메인 화면");
        System.out.println("1. 역 관리");
        System.out.println("2. 노션 관리");
        System.out.println("3. 구간 관리");
        System.out.println("4. 지하철 노선도 출력력");
    }


    public static void printStationManagementScreen() {
        System.out.println("1. 역 등록");
        System.out.println("2. 역 삭제");
        System.out.println("3. 역 조회");
        System.out.println("B. 돌아가기\n");

    }

    public static void printLineManagementScreen(){
        System.out.println("1. 노션 등록");
        System.out.println("2. 노션 삭제");
        System.out.println("3. 노션 조회");
        System.out.println("B. 돌아가기");
    }

    public static void printSelectFunction() {
        System.out.println("## 원하는 기능을 선택하세요.");
    }





}
