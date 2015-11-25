import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by saylik on 25/11/15.
 */
public class Guide {

    private Map<String,String> numberToSymbolMapper;
    private Translator translator;

    public Guide() {
        this.numberToSymbolMapper = new HashMap();
        numberToSymbolMapper.put("glob","I");
        numberToSymbolMapper.put("prok","V");
        numberToSymbolMapper.put("pish","X");
        numberToSymbolMapper.put("tegj","L");
        this.translator = new Translator();
    }

    public int translate(String galaxyNumber) {
        String[] numbers = galaxyNumber.split(" ");
        List<String> symbols = new ArrayList<String>();
        for (String number : numbers) {
            symbols.add(numberToSymbolMapper.get(number));
        }
        return translator.getValue(symbols);
    }
}
