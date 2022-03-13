package hello.itemservice.web.validation.Form;


import hello.itemservice.domain.item.SaveCheck;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ItemUpdateForm {

    @NotNull
    private Long id;

    @NotBlank
    private String itemName;

    @NotNull
    @Range(min=100,max=1000000)
    private Integer price;

    private Integer quantity;
}
