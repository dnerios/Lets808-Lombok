import com.letscode.cafe.Cafe;
import com.letscode.cafe.CafeLombok;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class CafeApplication {
    public static void main(String[] args) {

        //Instância sem utilizar o lombok
        Cafe cafeSemLombok = new Cafe("Café", "2022", "Aroma bom");
        System.out.println("Café sem Lombok: " + cafeSemLombok.toString());
        cafeSemLombok.imprimirCardapio(cafeSemLombok.getSabor(), cafeSemLombok.getSafra());

        //Instância utilizando o lombok
        CafeLombok cafeLombokRebelde = new CafeLombok();
        CafeLombok cafeLombok = new CafeLombok("Café", "2022", "Aroma bom");
        System.out.println("Café com Lombok: " + cafeLombok.toString());

        //Utilizando @Builder
        CafeLombok cafeNull = CafeLombok.builder().build();
        CafeLombok cafeBuilder = CafeLombok.builder()
                .sabor("Café")
                .safra("2022")
                .aroma("Aroma bom")
                .build();
        System.out.println("Café com Builder: " + cafeBuilder.toString());

        try {
            cafeBuilder.imprimirCardapio(cafeBuilder.getSabor(), cafeBuilder.getSafra());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
