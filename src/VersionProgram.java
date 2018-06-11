
public class VersionProgram {

    public static void main(String[] args) {
    Algorithms alg=new Algorithms();
    int val = -2;
    int itResult, reResult, stResult, finalResult;

        System.out.println("Wartość argumentu: " + val);

        itResult = alg.iterateFibonacci(val);
        stResult = alg.streamFibonacci(val);
        reResult = alg.recursiveFibonacci(val);

        checkIfError(itResult, "iteracja");
        checkIfError(stResult, "strumienie");
        checkIfError(reResult, "rekurencyja");

        finalResult = alg.vote(itResult, reResult, stResult);
        checkIfError(finalResult, "głosowanie");
    }

    public static void checkIfError(int result, String message){
        if(result < 0)
            System.out.println("Błąd - " + message);
        else
            System.out.println(message + ": " +result);
    }
}
