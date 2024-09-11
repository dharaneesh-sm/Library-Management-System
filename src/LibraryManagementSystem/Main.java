package LibraryManagementSystem;

import javax.naming.directory.SearchControls;
import java.util.Scanner;
import java.util.Date;

import static LibraryManagementSystem.MaintainingBooks.*;
import static LibraryManagementSystem.Registration.*;

public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while(loop)
        {
            System.out.println("Enter Menu ID");
            int Menu_Id = sc.nextInt();
            switch (Menu_Id)
            {
                case 1: {
                    System.out.println("Enter UserName :");
                    String name = sc.next();
                    String user = CheckUser(name);
                    if(!user.equals("No"))
                    {
                        System.out.println("FAILURE, Already registered "+user);
                    }
                    else
                    {
                        System.out.println("Enter Date of Joining :");
                        String date = sc.next();
                        System.out.println(Register(name,date));
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter UserName :");
                    String name = sc.next();
                    if (Cancel(name))
                        System.out.println("SUCCESS, Membership cancelled " + name);
                    else
                        System.out.println("FAILURE, Not registered member " + name);
                    break;
                }
                case 3: {
                    ListOfUsers();
                    break;
                }
                case 4: {
                    String name = sc.next();
                    int row = sc.nextInt();
                    int col = sc.nextInt();
                    int shelf = sc.nextInt();
                    AddBooks(name,row,col,shelf);
                    break;
                }
                case 5: {
                    String bookName = sc.next();
                    String book = Search(bookName);
                    if(book.equals("No"))
                        System.out.println("FAILURE, "+bookName+" not found");
                    else
                        System.out.println("SUCCESS, Found "+book);
                    break;
                }
                case 6: {
                    String userName = sc.next();
                    if(CheckUser(userName).equals("No"))
                    {
                        System.out.println("FAILURE "+userName+" not Registered");
                        break;
                    }
                    String bookName = sc.next();
                    if(Search(bookName).equals("No"))
                    {
                        System.out.println("FAILURE "+bookName+" not Found");
                        break;
                    }
                    String date = sc.next();
                    if(CheckOut(userName,bookName,date))
                        System.out.println("SUCCESS, "+userName+" borrowed "+bookName);
                    else
                        System.out.println();
                }
                case 99: {
                    loop = false;
                    break;
                }
            }
        }
    }
}
