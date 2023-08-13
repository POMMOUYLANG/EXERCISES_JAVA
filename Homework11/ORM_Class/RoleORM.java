package Homework.Homework11.ORM_Class;

import java.sql.SQLException;
import java.sql.Statement;

import Homework.Homework11.Models_classes.Role;


public class RoleORM extends ORM<Role> {

    public RoleORM() {
        super();
        tableName = "roles";
    }

    @Override
    public Role add(Role t) {
        try (var stmt = connection.createStatement()) {
            var sql = "INSERT INTO " + tableName + " VALUES(NULL, '" + t.getRole() + "')";
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
        Role adminRole = new Role(0, "Admin");
        Role customerRole = new Role(0, "Customer");
        roleORM.add(adminRole);
        roleORM.add(customerRole);

        System.out.println("Id: " + adminRole.getId() + "; Role: " + adminRole.getRole());
        System.out.println("Id: " + customerRole.getId() + "; Role: " + customerRole.getRole());
    }
}

