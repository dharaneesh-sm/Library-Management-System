package LibraryManagementSystem;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Registration extends User{
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, User> map = new HashMap<>();

    public Registration(String userName, String date_Of_Joined) {
        super(userName, date_Of_Joined);
    }
    public static String CheckUser(String name){
        if(map.containsKey(name))
            return map.get(name).toString();
        return "No";
    }
    public static String Register(String name,String date)
    {
        User user = new User(name,date);
        map.put(name, user);
        return "SUCCESS, Registered "+name;
    }
    public static boolean Cancel(String name){
        if(map.containsKey(name))
        {
            map.remove(name);
            return true;
        }
        else
            return false;
    }
    public static void ListOfUsers(){
        for(Map.Entry<String,User> entry : map.entrySet())
        {
            System.out.println(entry.getValue());
        }
    }
}
