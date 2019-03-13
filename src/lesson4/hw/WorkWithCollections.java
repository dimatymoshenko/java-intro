package lesson4.hw;


import java.util.ArrayList;
import java.util.Comparator;

public class WorkWithCollections {

    public ArrayList<String> removeItem(String item, ArrayList<String> list){
        if(list!=null && !list.isEmpty()){
            if(list.contains(item)) {
                list.remove(item);
            }
        }
        return list;
    }

    public ArrayList<String> removeItem(int index, ArrayList<String> list){
        if(list!=null && !list.isEmpty()){
            if(index >=0 && index <= list.size())
                list.remove(index);
        }
        return list;
    }

    public boolean isCollectionContains(ArrayList<String> list, String item){
        if(list.contains(item)){
            System.out.println("We can't find element: " +item);
            return true;
        }
        else{
            System.out.println("Collection contains item: " +item);
            return false;
        }
    }

    public ArrayList<String> sortCollection(ArrayList<String> list){
        try {
            list.sort(Comparator.naturalOrder());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public void printToConsole(ArrayList<String> list){
        try {
            if (!list.isEmpty()) {
                if (list != null) {
                    for (String str : list) {
                        System.out.println(str);
                    }
                }
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}