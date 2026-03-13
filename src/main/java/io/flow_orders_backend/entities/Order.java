package io.flow_orders_backend.entities;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.flow_orders_backend.entities.enums.OrderStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    private Integer orderStatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order() {
    }

    public Order(Long orderId, Instant moment, OrderStatus orderStatus, User client) {
        super();
        this.orderId = orderId;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client;
    }

    public Long getOrderId() { return orderId; }

    public void setOrderId(Long id) { this.orderId = orderId; }

    public Instant getMoment() { return moment; }

    public void setMoment(Instant moment) { this.moment = moment; }

    public OrderStatus getOrderStatus() { return OrderStatus.valueOf(orderStatus); }

    public void setOrderStatus(OrderStatus orderStatus) {
        if (orderStatus != null){
        this.orderStatus = orderStatus.getCode();}
    }

    public User getClient() { return client; }

    public void setClient(User client) { this.client = client; }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (orderId == null) {
            if (other.orderId != null)
                return false;
        }
        else if (!orderId.equals(other.orderId))
            return false;
        return true;
    }
}