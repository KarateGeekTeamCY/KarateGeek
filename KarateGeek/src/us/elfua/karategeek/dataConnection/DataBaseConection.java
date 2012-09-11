/*
 karate geek 
 
 Copyright (C) 2012  michael theodorides <mc.theodorides@gmail.com>

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
 */
package us.elfua.karategeek.dataConnection;

/**
 *
 * @author michael theodorides
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.lang.System;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseConection {

    private Connection connection;

    private Connection connect() {

        System.out.println("-------- PostgreSQL "
                + "JDBC Connection Testing ------------");

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
        }

        System.out.println("PostgreSQL JDBC Driver Registered!");

        try {
            this.connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/testdb", "mkyong", "123456");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        return this.connection;
    }

    public ResultSet executeQuery(String SQL) throws SQLException {
        this.connect();

        ResultSet rst;
        Statement stm;
        this.connect();
        stm = this.connection.createStatement();
        rst = stm.executeQuery(SQL);

        this.connection.close();

        return rst;
    }

    public boolean executeNonQuery(String SQL) throws SQLException {
        this.connect();

        boolean status;
        Statement stm;
        this.connect();
        stm = this.connection.createStatement();
        status = stm.execute(SQL);

        this.connection.close();

        return status;
    }

    public Connection GetConn() {
        if (this.connection != null) {
            return this.connection;
        } else {
            return connect();
        }
    }
}
