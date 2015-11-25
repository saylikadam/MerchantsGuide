/**
 * Created by saylik on 25/11/15.
 */
public class Rules {

    public boolean isAddable(String firstSymbol, String nextSymbol) {
        return SymbolToValueMapper.getValue(firstSymbol) > SymbolToValueMapper.getValue(nextSymbol);
    }
}
