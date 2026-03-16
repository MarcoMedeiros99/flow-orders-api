package io.flow_orders_backend.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    //Mapping & Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;

    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private Set<Product> products = new HashSet<>();

    //Constructors

    public Category() {
    }

    public Category(Long id, String categoryName) {
        super();
        this.id = id;
        this.categoryName = categoryName;
    }

    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long categoryId) {
        this.id = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Transient
    public Set<Product> getProducts() {
        return products;
    }

    //Equals() and HashCode()

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
