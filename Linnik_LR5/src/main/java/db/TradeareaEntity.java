package db;

import javax.persistence.*;

@Entity
@Table(name = "tradearea", schema = "databasecourse", catalog = "")
public class TradeareaEntity {
    private int idTradeArea;
    private String name;
    private int hall;
    private StaffEntity staffByStaffId;

    @Id
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TradeareaEntity that = (TradeareaEntity) o;

        if (idTradeArea != that.idTradeArea) return false;
        if (hall != that.hall) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTradeArea;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + hall;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Staff_id", referencedColumnName = "idStaff", nullable = false)
    public StaffEntity getStaffByStaffId() {
        return staffByStaffId;
    }

    public void setStaffByStaffId(StaffEntity staffByStaffId) {
        this.staffByStaffId = staffByStaffId;
    }
}
