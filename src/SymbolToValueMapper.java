import java.util.HashMap;
import java.util.Map;

/**
 * Created by saylik on 25/11/15.
 */
public class SymbolToValueMapper {
    private static Map<String,Integer> symbolToValue= new HashMap();;

    public static int getValue(String symbol){
        symbolToValue.put("I",1);
        symbolToValue.put("V",5);
        symbolToValue.put("X",10);
        symbolToValue.put("L",50);
        return symbolToValue.get(symbol);
    }
}
