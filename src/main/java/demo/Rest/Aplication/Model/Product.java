package demo.Rest.Aplication.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    final private String title="Gadget Store";

    public String getTitle() {
        return title;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String product;
    private int price;
    private boolean Quantity;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YYYY")
    private Date release_date;
    private String description;
}
