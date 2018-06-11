import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Algorithms {

    public int vote(int val1,int val2,int val3){
        Map<Integer,Integer>map=new LinkedHashMap<>();
        checkValue(map,val1);
        checkValue(map,val2);
        checkValue(map,val3);

        if(map.size()==3 || map.size()==0) return -1; //error
        else if(map.size()==1) return val1;
        else{
            if(map.get(val1)==2) return val1;
            else if(map.get(val2)==2) return val2;
            else return val3;
        }
    }

    private void checkValue(Map<Integer,Integer> map,int val){
        if(val >= 0) {
            if (map.containsKey(val))
                map.put(val, map.get(val) + 1);
            else map.put(val, 1);
        }
    }

    public int recursiveFibonacci(int val){
        if(val<0 || val >= 50) return -1;
        if (val==0) return 0;
        else if(val<=2) return 1;
        return recursiveFibonacci(val-1)+recursiveFibonacci(val-2);
    }

    public int recursiveFactorial(int val){
        if(val==0) return 1;
        else if (val<0) return -1;
        else if(val<2) return 1;
        return val*recursiveFactorial(val-1);
    }

    public int streamFibonacci(int val){
        if(val==0) return 0;
        else if(val<0) return -1;
        else if(val<=2) return 1;
        return Stream.iterate(new int[] {1, 1}, f -> new int[] {f[1], f[0] + f[1]})
                .limit(val)
                .reduce((a, b) -> b)
                .get()[0];
    }

    public int streamFactorial(int val) {
        if (val == 0) return 1;
        else if (val < 0) return -1;
        return Stream.iterate(new int[]{val, val - 1}, f -> new int[]{f[1] * f[0], f[1] - 1})
                .limit(val)
                .reduce((a, b) -> b)
                .get()[0];
    }

    public int iterateFibonacci(int val) {
        if(val<0) return -1;
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < val; i++) {
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    public int iterateFactorial(int val)
    {
        if (val < 0) return -1;
        int product = 1;
        for ( int j =1; j <= val; j++ )
            product *= j;
        return product;
    }
}
