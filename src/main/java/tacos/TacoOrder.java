package tacos;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder {

   @NotBlank(message="Delivery name is required")
   private String deliveryName;

   @NotBlank(message="Street is required")
   private String deliveryStreet;

   @NotBlank(message="City is required")
   private String deliveryCity;

   @NotBlank(message="State is required")
   private String deliveryState;

   @NotBlank(message="Zipcode is required")
   @Digits(integer = 5, fraction = 0, message="Invalid zipcode")
   private String deliveryZip;

   @CreditCardNumber(message="Invaild credit card number")
   private String ccNumber;

   @Pattern(regexp="^(0[1-9]|1[0-2])(/)([2-9][0-9])$", message="Must be formatted MM/YY")
   private String ccExpiration;

   @Pattern(regexp="^[0-9]{3,4}$", message="Invalid CVV")
   private String ccCVV;

   private List<Taco> tacos = new ArrayList<>();

   public void addTaco(Taco taco) {
      this.tacos.add(taco);
   }
}
