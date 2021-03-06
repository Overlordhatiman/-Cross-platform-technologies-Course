package db;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "staff", schema = "databasecourse", catalog = "")
public class StaffEntity {
    private int idStaff;
    private String firstName;
    private String secondName;
    private String thirdName;
    private String pasNumber;
    private Timestamp birthDate;
    private int experience;
    private PositionEntity positionByPositionIdPosition;

    @Id
    @Column(name = "idStaff", nullable = false)
    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    @Basic
    @Column(name = "FirstName", nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "SecondName", nullable = false, length = 45)
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Basic
    @Column(name = "ThirdName", nullable = true, length = 45)
    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    @Basic
    @Column(name = "PasNumber", nullable = false, length = 45)
    public String getPasNumber() {
        return pasNumber;
    }

    public void setPasNumber(String pasNumber) {
        this.pasNumber = pasNumber;
    }

    @Basic
    @Column(name = "BirthDate", nullable = false)
    public Timestamp getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Timestamp birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "Experience", nullable = false)
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StaffEntity that = (StaffEntity) o;

        if (idStaff != that.idStaff) return false;
        if (experience != that.experience) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (secondName != null ? !secondName.equals(that.secondName) : that.secondName != null) return false;
        if (thirdName != null ? !thirdName.equals(that.thirdName) : that.thirdName != null) return false;
        if (pasNumber != null ? !pasNumber.equals(that.pasNumber) : that.pasNumber != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStaff;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (thirdName != null ? thirdName.hashCode() : 0);
        result = 31 * result + (pasNumber != null ? pasNumber.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + experience;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "Position_idPosition", referencedColumnName = "idPosition", nullable = false)
    public PositionEntity getPositionByPositionIdPosition() {
        return positionByPositionIdPosition;
    }

    public void setPositionByPositionIdPosition(PositionEntity positionByPositionIdPosition) {
        this.positionByPositionIdPosition = positionByPositionIdPosition;
    }
}
