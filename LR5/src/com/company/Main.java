package com.company;

import java.sql.*;

public class Main {

    public static void Show(Context context) throws SQLException, ClassNotFoundException {
        System.out.println(context.showPos());
        System.out.println(context.showEmp());
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Context context = new Context();

        Show(context);
        context.DeleteFromEmp(2);
        Show(context);
        Employee em = new Employee(2, "Kapinos","Kpainos2","Kapinos3", 1);
        System.out.println(em.toString());
        context.AddToEmp(em);
        Show(context);
    }
}
