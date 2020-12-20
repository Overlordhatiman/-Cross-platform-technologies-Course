package db;

import javax.persistence.*;

@Entity
@Table(name = "typeofpoint", schema = "databasecourse", catalog = "")
public class TypeofpointEntity {
    private int idTypeOfPoint;
    private String name;
    private CharacteristicEntity characteristicByCharacteristicId;

    @Id
    @Column(name = "idTypeOfPoint", nullable = false)
    public int getIdTypeOfPoint() {
        return idTypeOfPoint;
    }

    public void setIdTypeOfPoint(int idTypeOfPoint) {
        this.idTypeOfPoint = idTypeOfPoint;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeofpointEntity that = (TypeofpointEntity) o;

        if (idTypeOfPoint != that.idTypeOfPoint) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTypeOfPoint;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = " Characteristic_id", referencedColumnName = "idCharacteristic", nullable = false)
    public CharacteristicEntity getCharacteristicByCharacteristicId() {
        return characteristicByCharacteristicId;
    }

    public void setCharacteristicByCharacteristicId(CharacteristicEntity characteristicByCharacteristicId) {
        this.characteristicByCharacteristicId = characteristicByCharacteristicId;
    }
}
