package hello.itemservice.domain.item;

import lombok.Data;

//@Getter @Setter 를 쓰는게 좋다
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;  // 안들어 올 수도 있기에 null 값이 가능하게 Integer
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
