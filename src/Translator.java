import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by saylik on 25/11/15.
 */
public class Translator {
    private Rules rules;
    public Translator() {
        this.rules = new Rules();
    }

    public int getValue(List<String> symbols) {
       int finalValue = 0;
       for(int i = 0; i < symbols.size()-1; i++){
           String thisSymbol =  symbols.get(i);
           String nextSymbol =  symbols.get(i+1);
           if(rules.isAddable(symbols.get(i),symbols.get(i+1))){
               finalValue += SymbolToValueMapper.getValue(thisSymbol) + SymbolToValueMapper.getValue(nextSymbol);
           }
           finalValue += SymbolToValueMapper.getValue(nextSymbol) - SymbolToValueMapper.getValue(thisSymbol);
       }
        return finalValue;
    }
}
