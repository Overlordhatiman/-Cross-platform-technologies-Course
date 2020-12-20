package db;

import javax.persistence.*;

@Entity
@Table(name = "position", schema = "databasecourse", catalog = "")
public class PositionEntity {
    private int idPosition;
    private String name;
    private double salary;

    @Id
    @Column(name = "idPosition", nullable = false)
    public int getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(int idPosition) {
        this.idPosition = idPosition;
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
    @Column(name = "Salary", nullable = false, precision = 0)
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PositionEntity that = (PositionEntity) o;

        if (idPosition != that.idPosition) return false;
        if (Double.compare(that.salary, salary) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idPosition;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
