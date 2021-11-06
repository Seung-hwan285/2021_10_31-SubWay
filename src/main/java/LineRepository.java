
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

    // 노선 목록 출력
    public static void printLineList(List<Line> lineList){
        for(int i=0; i<lineList.size(); i++){
            System.out.println(lineList.get(i).getName());
        }
    }






}
