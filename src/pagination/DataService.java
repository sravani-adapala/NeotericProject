package pagination;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    public List<String> getNames(){

        List<String> nameList=new ArrayList<>();

        for (int i=0;i<104;i++){

            nameList.add(String.valueOf(i));      // valueOf(i)-Static method

        }
        return nameList;
    }


}
