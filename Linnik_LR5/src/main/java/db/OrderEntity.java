package db;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "order", schema = "databasecourse", catalog = "")
public class OrderEntity {
    private int idOrder;
    private int numberOfOrder;
    private Timestamp timeOfOrder;
    private ClientcardEntity clientcardByClientCardIdClientCard;

    @Id
    @Column(name = "idOrder", nullable = false)
    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    @Basic
    @Column(name = "NumberOfOrder", nullable = false)
    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    @Basic
    @Column(name = "TimeOfOrder", nullable = true)
    public Timestamp getTimeOfOrder() {
        return timeOfOrder;
    }

    public void setTimeOfOrder(Timestamp timeOfOrder) {
        this.timeOfOrder = timeOfOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (idOrder != that.idOrder) return false;
        if (numberOfOrder != that.numberOfOrder) return false;
        if (timeOfOrder != null ? !timeOfOrder.equals(that.timeOfOrder) : that.timeOfOrder != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrder;
        result = 31 * result + numberOfOrder;
        result = 31 * result + (timeOfOrder != null ? timeOfOrder.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ClientCard_idClientCard", referencedColumnName = "idClientCard", nullable = false)
    public ClientcardEntity getClientcardByClientCardIdClientCard() {
        return clientcardByClientCardIdClientCard;
    }

    public void setClientcardByClientCardIdClientCard(ClientcardEntity clientcardByClientCardIdClientCard) {
        this.clientcardByClientCardIdClientCard = clientcardByClientCardIdClientCard;
    }
}
