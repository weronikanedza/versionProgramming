import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Alghoritms {

    int vote(int val1,int val2,int val3){
        Map<Integer,Integer>map=new LinkedHashMap<>();
        checkValue(map,val1);
        checkValue(map,val2);
        checkValue(map,val3);

        if(map.size()==3) return -1; //error
        else if(map.size()==1) return val1;
        else{
            if(map.get(val1)==2) return val1;
            else if(map.get(val2)==2) return val2;
            else return val3;
        }
    }

    void checkValue(Map<Integer,Integer> map,int val){
        if(map.containsKey(val))
            map.put(val,map.get(val)+1);
        else map.put(val,1);
    }

    int recursiveFib(int val){
        if (val==0) return 0;
        else if(val<=2) return 1;
        else if(val<0) return -1;
        return recursiveFib(val-1)+recursiveFib(val-2);
    }

    int recursiveFac(int val){
        if(val==0) return 1;
        else if(val<2) return 1;
        else if (val<0) return -1;
        return val*recursiveFac(val-1);
    }

    int streamFib(int val){
        if(val==0) return 0;
        else if(val<=2) return 1;
        else if(val<0) return -1;
        return Stream.iterate(new int[] {1, 1}, f -> new int[] {f[1], f[0] + f[1]})
                .limit(val)
                .reduce((a, b) -> b)
                .get()[0];
    }

    int streamFac(int val) {
        if (val == 0) return 1;
        else if (val < 0) return -1;
        return Stream.iterate(new int[]{val, val - 1}, f -> new int[]{f[1] * f[0], f[1] - 1})
                .limit(val)
                .reduce((a, b) -> b)
                .get()[0];
    }

    int iterateFibonacci(int n) {
        if (n <= 1) return n;
        else return iterateFibonacci(n-1) + iterateFibonacci(n-2);
    }

    int iterateStrong(int i)
    {
        if (i < 1)
            return 1;
        else
            return i * iterateStrong(i - 1);
    }
}
