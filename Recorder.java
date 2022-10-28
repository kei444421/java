import java.util.HashMap;
import java.util.Map;

//�ۑ�1
public class Recorder{
    private Map<String, String> map = new HashMap<>();

    //�}�b�v��key��value��o�^����
    public void put(String key, String value){
        map.put(key,value);
        System.out.println(key + "��" + value);
    }

    //�}�b�v��key�����݂���ꍇ�Avalue���o�͂���
    public void get(String key){
        if(!map.containsKey(key)){
            throw new IllegalArgumentException();
        }
        System.out.println(map.get(key));
    }

    //�����œn���ꂽkey��value�̑g�ݍ��킹���}�b�v����폜����
    public void delete(String key){
        if(!map.containsKey(key)){
            throw new IllegalArgumentException();
        }
        map.remove(key);
        System.out.println("deleted:" + key);
    }

    //�}�b�v�ɓo�^����Ă���S�Ă�key��value���폜����
    public void delete(){
        map.clear();
        System.out.println("deleted all");
    }
}