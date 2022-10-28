import java.util.HashMap;
import java.util.Map;

//課題1
public class Recorder{
    private Map<String, String> map = new HashMap<>();

    //マップにkeyとvalueを登録する
    public void put(String key, String value){
        map.put(key,value);
        System.out.println(key + "＝" + value);
    }

    //マップにkeyが存在する場合、valueを出力する
    public void get(String key){
        if(!map.containsKey(key)){
            throw new IllegalArgumentException();
        }
        System.out.println(map.get(key));
    }

    //引数で渡されたkeyとvalueの組み合わせをマップから削除する
    public void delete(String key){
        if(!map.containsKey(key)){
            throw new IllegalArgumentException();
        }
        map.remove(key);
        System.out.println("deleted:" + key);
    }

    //マップに登録されている全てのkeyとvalueを削除する
    public void delete(){
        map.clear();
        System.out.println("deleted all");
    }
}