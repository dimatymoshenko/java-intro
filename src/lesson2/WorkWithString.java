package lesson2;

public class WorkWithString {

    public static String eachNth(String curent, int n)
    {
        if(!curent.isEmpty())
        {
            String returnString = "";
            char [] arrCurent = curent.toCharArray();
            for(int i=0; i<curent.length(); i=i+n){
                returnString += arrCurent[i];
            }
            return returnString;
        }
        else
        {
            return null;
        }
    }
}