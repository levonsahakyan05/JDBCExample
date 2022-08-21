package jdbcexample.db;

import jdbcexample.db.manager.UserManager;
import jdbcexample.db.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();

        try {
//            User user = new User("poxos", "poxosyan", "poxos@poxos.com", "poxos");
//            userManager.addUser(user);
//            System.out.println(user);
            List<User> allUser = userManager.getAllUser();
            for (User user : allUser) {
                System.out.println(user);
            }
            System.out.println();
            userManager.deleteUserById(4);
            allUser = userManager.getAllUser();
            for (User user : allUser) {
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
