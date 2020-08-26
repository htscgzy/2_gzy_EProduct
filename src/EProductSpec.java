import java.util.HashMap;
import java.util.Iterator;

public class EProductSpec {

    private HashMap<String,Object> properties;

    public HashMap<String, Object> getProperties() {
        return properties;
    }

    public EProductSpec(HashMap<String, Object> properties) {
        this.properties = properties;
    }

    public Object getProperity(String propertyName){
        return properties.get(propertyName);
    }

    //SRP原则
    public boolean match(EProductSpec otherSpec){
        for(Iterator i = otherSpec.properties.keySet().iterator();i.hasNext();){
            String propertyName = (String)i.next();
            if(!properties.containsKey(propertyName))
                return false;
            if(!properties.get(propertyName).equals(otherSpec.getProperity(propertyName)))
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " "+properties;
    }
}
