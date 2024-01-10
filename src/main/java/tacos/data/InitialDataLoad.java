package tacos.data;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tacos.Ingredient;
import tacos.Ingredient.Type;

@Configuration
public class InitialDataLoad {
   @Bean
   public ApplicationRunner dataLoader(IngredientRepository ingredientRepo) {
      return args -> {
         ingredientRepo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
         ingredientRepo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
         ingredientRepo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
         ingredientRepo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
         ingredientRepo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
         ingredientRepo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
         ingredientRepo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
         ingredientRepo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
         ingredientRepo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
         ingredientRepo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
      };
   }
}
