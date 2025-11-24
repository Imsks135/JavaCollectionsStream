package org.oops.singletonclass.eagerinitilalisation;


public class DBConnection {
    // SingletonClass
    // All static variable are loaded when app started ,this is eagerInitialization
    //initialising an object here
    private static final DBConnection dbConnection = new DBConnection();

    private DBConnection() {

    }
    public static DBConnection getInstance() {
        return dbConnection;
    }
}
