package ua.com.owu.products_practice_2.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    @GeneratedValue
    int id;
    String name;
    String description;
    int price;

    public Product(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
