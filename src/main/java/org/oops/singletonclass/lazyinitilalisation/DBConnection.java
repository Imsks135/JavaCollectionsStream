package org.oops.singletonclass.lazyinitilalisation;

public class DBConnection {
    private static DBConnection dbConnection;
    DBConnection(){

    }
    public static DBConnection getInstance(){
        if(dbConnection == null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
