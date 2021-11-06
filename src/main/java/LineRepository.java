
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class LineRepository {

    /**
     * 노션
     * 1. 노션을 등록하고 삭제할 수 있다
     * 2. 중복된 노선 이름이 등록될 수 없다
     * 3. 이름은 2글자 이상이어야한다
     *
     */
    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    //1. 노선 목록 출력
    public static void printLineList(List<Line> lineList){
        for(int i=0; i<lineList.size(); i++){
            System.out.println(lineList.get(i).getName());
        }
    }

    //2. 중복된 노션 이름 체크
    public static boolean isDuplicateLine(String name){
        for(Line line : lines){
            if(line.getName().contains(name)){
                System.out.println(name+"노선 이름 중복됩니다.");
                return false;
            }
        }
        return true;
    }

    //3. 이름은 2글자이상이어ㅑ한다
    public static boolean checkNameLine(String name){
        if (name.length() <= 2){
            System.out.println("글자수 길이 2이상으로 맞춰주세요");
            return false;
        }
        return true;
    }






}
