package LibraryManagementSystem;

import java.util.Date;

public class User {
    private String userName;
    private String date_Of_Joined;

    public User(String userName, String date_Of_Joined) {
        this.userName = userName;
        this.date_Of_Joined = date_Of_Joined;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate_Of_Joined() {
        return date_Of_Joined;
    }

    public void setDate_Of_Joined(String date_Of_Joined) {
        this.date_Of_Joined = date_Of_Joined;
    }

    @Override
    public String toString() {
        return userName +", "+ date_Of_Joined;
    }
}
