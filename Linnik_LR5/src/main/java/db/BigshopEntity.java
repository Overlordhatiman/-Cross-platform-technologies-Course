package db;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bigshop", schema = "databasecourse", catalog = "")
public class BigshopEntity {
    private int idTradeArea;
    private String name;
    private int hall;
    private int typeOfPointId;
    private int staffId;

    @Basic
    @Column(name = "idTradeArea", nullable = false)
    public int getIdTradeArea() {
        return idTradeArea;
    }

    public void setIdTradeArea(int idTradeArea) {
        this.idTradeArea = idTradeArea;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Hall", nullable = false)
    public int getHall() {
        return hall;
    }

    public void setHall(int hall) {
        this.hall = hall;
    }

    @Basic
    @Column(name = "TypeOfPoint_id", nullable = false)
    public int getTypeOfPointId() {
        return typeOfPointId;
    }

    public void setTypeOfPointId(int typeOfPointId) {
        this.typeOfPointId = typeOfPointId;
    }

    @Basic
    @Column(name = "Staff_id", nullable = false)
    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BigshopEntity that = (BigshopEntity) o;

        if (idTradeArea != that.idTradeArea) return false;
        if (hall != that.hall) return false;
        if (typeOfPointId != that.typeOfPointId) return false;
        if (staffId != that.staffId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTradeArea;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + hall;
        result = 31 * result + typeOfPointId;
        result = 31 * result + staffId;
        return result;
    }
}
