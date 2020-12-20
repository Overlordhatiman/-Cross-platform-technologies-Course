package db;

import javax.persistence.*;

@Entity
@Table(name = "characteristic", schema = "databasecourse", catalog = "")
public class CharacteristicEntity {
    private int idCharacteristic;
    private String name;
    private int section;

    @Id
    @Column(name = "idCharacteristic", nullable = false)
    public int getIdCharacteristic() {
        return idCharacteristic;
    }

    public void setIdCharacteristic(int idCharacteristic) {
        this.idCharacteristic = idCharacteristic;
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
    @Column(name = "Section", nullable = false)
    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CharacteristicEntity that = (CharacteristicEntity) o;

        if (idCharacteristic != that.idCharacteristic) return false;
        if (section != that.section) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCharacteristic;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + section;
        return result;
    }
}
