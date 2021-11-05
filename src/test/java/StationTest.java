import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.awt.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class StationTest {

    private StationRepository stationRepository;
    private final Station s=new Station("판역");
    private  SubwayMangement subwayMangement;

    @Test
    void 초기(){
        stationRepository=new StationRepository();
        subwayMangement=new SubwayMangement();
    }

    @Test
    void 지하철역_출력체크(){

        //판교역 추가
        stationRepository.addStation(s);
        stationRepository.printStation();
    }

    @Test
    void 글자수체크(){
        assertTrue(stationRepository.checkNameLen("광교"));
    }


    @Test
    void 화면출력(){
        subwayMangement.start();
    }


}
