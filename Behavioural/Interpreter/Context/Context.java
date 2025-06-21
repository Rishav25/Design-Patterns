package Context;

import java.util.HashMap;
import java.util.Map;

public class Context {

    Map<String, Integer> contextMap = new HashMap<>();

    public void putValue(String key, Integer val){
        contextMap.put(key, val);
    }

    public Integer getValue(String key){
        return contextMap.get(key);
    }

}
