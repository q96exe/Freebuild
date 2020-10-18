package de.marv.freebuild.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {

    private static String host = "";
    private static String port = "";
    private static String username = "";
    private static String password = "";
    private static String database = "";

    private static Connection con;

    public static void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            setCon(DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?autoreconnect=true&useSSL=false", username, password));
            System.out.println("");
            System.out.println("[MySQL] Verbindung wurde aufgebaut");
            System.out.println("");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean isConnected() {
        return !(getCon() == null);
    }

    public static void disconnect() {
        if (isConnected())
            try {
                getCon().close();
                System.out.println("");
                System.out.println("[MySQL] Verbindung wurde geschlossen");
                System.out.println("");
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public static void createTable() {
        if (isConnected())
            try {
                getCon().createStatement().executeUpdate("CREATE TABLE IF NOT EXISTS MutesTable (UUID VARCHAR (100), int mutes)");
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        MySQL.con = con;
    }
}

