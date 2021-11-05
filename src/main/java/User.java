import java.util.Scanner;

public class User {

    /**
     * 번호 선택 클래스 (사용자입력)
     */
    private final Scanner sc=new Scanner(System.in);

    //번호 선택
    public String geInput() {
        return sc.nextLine();
    }
}
