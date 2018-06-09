import java.util.LinkedHashMap;
import java.util.Map;

public class VersionProgram {

    public static void main(String[] args) {
    Alghoritms alg=new Alghoritms();
//        System.out.println(alg.recursiveFib(-3));
//        System.out.println(alg.recursiveFac(3));
        Map<Integer,Integer> map=new LinkedHashMap<>();
        map.put(1,8);
        map.put(2,3);
        System.out.println(map.get(1));

    }
}
