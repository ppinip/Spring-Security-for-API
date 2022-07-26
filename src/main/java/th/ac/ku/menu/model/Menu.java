package th.ac.ku.menu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity //โหลดจากแถวมาเป็น object อัตโนมัติ
public class Menu {

    //สร้าง column ใน database ให้อัตโนมัติ

    @Id //primary key
    @GeneratedValue
    private UUID id;

    private String name;
    private double price;
    private  String category;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
