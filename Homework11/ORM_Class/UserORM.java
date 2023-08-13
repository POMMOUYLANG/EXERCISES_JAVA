package Homework.Homework11.ORM_Class;

import java.sql.SQLException;
import java.sql.Statement;

import Homework.Homework11.Models_classes.Role;
import Homework.Homework11.Models_classes.User;

public class UserORM extends ORM<User> {

    public UserORM() {
        super();
        tableName = "users";
    }

    @Override
    public User add(User t) {
        try (var stmt = connection.createStatement()) {
            var sql = "INSERT INTO " + tableName + " VALUES(NULL, '" + t.getUsername() + "', '" + t.getPass() + "', '" + t.getEmail() + "', " +
                      t.getRole().getId() + ", " + t.getDiscount() + ", '" + t.getAvatar() + "')";
            stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            var rs = stmt.getGeneratedKeys();
            rs.next();
            t.setId(rs.getInt(1));
            return t;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        RoleORM roleORM = new RoleORM();
        Role customerRole = new Role(0, "Admin2");
        roleORM.add(customerRole);

        UserORM userORM = new UserORM();
        User user = new User(0, "tito", "********", "titotom@itc.edu.kh", customerRole, 50, "avatar/tito.png");
        userORM.add(user);
        System.out.println("Id: " + user.getId() + "; Username: " + user.getUsername() + "; Pass: " + user.getPass() + "; Email: " + user.getEmail() +
                           "; Role ID: " + user.getRole().getId() + "; Discount: " + user.getDiscount() + "; Avatar: " + user.getAvatar());
    }
}

