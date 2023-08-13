package Homework.Homework11.ORM_Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ORM<T> {
    protected Connection connection;
    protected String tableName=null;

    public ORM(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/canlender_db", "root", "26May2023@tito");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public ArrayList<T> listAll(){
        return new ArrayList<>();
    }

    public T add(T t) throws SQLException{
        return t;
    }

    public boolean delete(int id){
        return false;
    }

    public void update(T t){
          // update the object in the database
    }
    
    public ArrayList<T> rawQueryList(String query){
        return new ArrayList<>();
    }

}
