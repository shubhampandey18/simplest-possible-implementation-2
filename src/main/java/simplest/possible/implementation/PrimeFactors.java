package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public <T> List<Integer> of(int number) {
        if(numberIsEqualsToI(number, 1)) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        if(numberIsEqualsToI(number, 2)){
            result.add(2);
            return result;
        }
        return null;
    }

    private boolean numberIsEqualsToI(int number, int i) {
        return number == i;
    }
}
