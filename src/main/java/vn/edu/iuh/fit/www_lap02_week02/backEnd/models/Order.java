package vn.edu.iuh.fit.www_lap02_week02.backEnd.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long order_id;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;


    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;


    public Order() {
    }

    public Order(long order_id, LocalDateTime orderDate, Customer customer) {
        this.order_id = order_id;
        this.orderDate = orderDate;
        this.customer = customer;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", orderDate=" + orderDate +
                ", customer=" + customer +
                '}';
    }
}
