package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Context {

    Connection con;
    ArrayList<Position> pos;
    ArrayList<Employee> emp;

    public Context() {
        pos = new ArrayList<>();
        emp = new ArrayList<>();
    }

    private void createCon() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/lr5";
        String login = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, login, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private void selectElements() throws ClassNotFoundException, SQLException {
        pos.clear();
        emp.clear();
        createCon();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM position");
            while (rs.next()) {
                Position p = new Position(rs.getInt(1),rs.getString(2));
                pos.add(p);
            }
            rs = stmt.executeQuery("SELECT * FROM employee");
            while (rs.next()) {
                Employee p = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getInt(5));
                emp.add(p);
            }
            rs.close();
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            con.close();
        }
    }

    public String showPos() throws SQLException, ClassNotFoundException {
        selectElements();
        String s = "";
        for(Position p : pos)
        {
            s += "| id: " + p.id + "| name: |" + p.name + " |\n";
        }

        return s;
    }

    public String showEmp() throws SQLException, ClassNotFoundException {
        selectElements();
        String s = "";
        for(Employee p : emp)
        {
            s += "| id: " + p.id + "| FirstN: " + p.FirstN + " | SecondN: " + p.SecondN + " | ThirdN: " + p.ThirdN + " |\n";
        }

        return s;
    }

    public void AddToPos(Position p) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("INSERT INTO position (id, name) VALUES ('"+p.id+"', '"+p.name+"')");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
           con.close();
        }
    }

    public void DeleteFromPos(int _id) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("DELETE FROM position WHERE idPosition = "+_id);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            con.close();
        }
    }

    public void DeleteFromEmp(int _id) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("DELETE FROM employee WHERE idEmployee = "+_id);
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            con.close();
        }
    }

    public void AddToEmp(Employee p) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("INSERT INTO employee (idEmployee, FirstName, SecondName, ThirdName, IdPosition) VALUES ('"+p.id+"', '"+p.FirstN+"', '"+p.SecondN+"','"+p.ThirdN+"','"+p.idPos+"')");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            con.close();
        }
    }

}
