package LibraryManagementSystem;

import java.util.HashMap;

public class MaintainingBooks {
     static HashMap<String, Book> map = new HashMap<>();
     MaintainingBooks(){
         map.put("PonniyinSelvan", new Book("Ponniyin Selvan",3,0,1));
    }

    public static void AddBooks(String name, int row, int col, int shelf){
        map.put("PonniyinSelvan", new Book("Ponniyin Selvan",3,0,1));
        Book book = new Book(name,row,col,shelf);
        map.put(name,book);
    }

    public static String Search(String name){
        if(map.containsKey(name)){
            return map.get(name).toString();
        }
        return "No";
    }
    public static boolean CheckOut(String userName, String bookName, String date){
        if(map.get(bookName).isBorrowed())
        {
            return false;
        }
        map.get(bookName).setBorrowed(true);
        return true;
    }
//    public static boolean Return(String name){
//
//    }
}
