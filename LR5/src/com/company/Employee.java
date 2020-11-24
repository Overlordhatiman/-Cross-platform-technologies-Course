package com.company;

public class Employee {
    int id;
    String FirstN;
    String SecondN;
    String ThirdN;
    int idPos;

    public int getIdPos() {
        return idPos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstN() {
        return FirstN;
    }

    public void setFirstN(String firstN) {
        FirstN = firstN;
    }

    public String getSecondN() {
        return SecondN;
    }

    public void setSecondN(String secondN) {
        SecondN = secondN;
    }

    public String getThirdN() {
        return ThirdN;
    }

    public void setThirdN(String thirdN) {
        ThirdN = thirdN;
    }

    public Employee(int id, String firstN, String secondN, String thirdN, int idPos) {
        this.id = id;
        FirstN = firstN;
        SecondN = secondN;
        ThirdN = thirdN;
        this.idPos = idPos;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", FirstN='" + FirstN + '\'' +
                ", SecondN='" + SecondN + '\'' +
                ", ThirdN='" + ThirdN + '\'' +
                ", idPos='" + idPos + '\'' +
                '}';
    }
}
