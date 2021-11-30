import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    String s = "sad";
    char[] ch = s.toCharArray();
    Arrays.sort(ch);
    System.out.println(ch);
    
    //===
    Map<String, List<String>> map = new HashMap<>();
    if(map.get("key")==null){
      List<String> list = new ArrayList();
      map.put("key",list);
    }
    map.get("key").add("v");
    map.get("key").add("v2");
    map.forEach((k,v)-> System.out.println(v));
  }
}
