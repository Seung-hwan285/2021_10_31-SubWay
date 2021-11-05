import java.util.Scanner;

public class User {


    private final Scanner sc;

    public User(Scanner sc) {
        this.sc = sc;
    }

    public String getInput(){

        return sc.nextLine();
    }
}
