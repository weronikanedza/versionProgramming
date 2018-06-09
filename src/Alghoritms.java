import java.util.LinkedHashMap;
import java.util.Map;

public class Alghoritms {
    int vote(int val1,int val2,int val3){
        if(val1!=val2 && val1!=val3)
            return -1;

        if(val1==val2 && val1==val3) return val1;

        return 1;
    }

    int recursiveFib(int val){
        if (val<=2) return 1;
        else if(val<0) return -1;
        return recursiveFib(val-1)+recursiveFib(val-2);
    }

    int recursiveFac(int val){
        if(val<2) return 1;
        else if (val<0) return -1;
        return val*recursiveFac(val-1);
    }
}
