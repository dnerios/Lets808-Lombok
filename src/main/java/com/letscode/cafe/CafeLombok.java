package com.letscode.cafe;

import lombok.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CafeLombok implements ICafe {
    //Indicando a criação dos métodos Getter e Setter
    @Getter
    @Setter
    private String sabor;

    //Criação apenas do Getter
    @Getter
    private String safra;

    //Criação apenas do Setter
    @Setter
    private String aroma;

    @Override
    public void imprimirCardapio(String sabor, String safra) throws FileNotFoundException, UnsupportedEncodingException {
        @Cleanup PrintWriter writer = new PrintWriter("cardapio-lombok.txt", "UTF-8");
        writer.println("CARDÁPIO LET'S CODE");
        writer.println("Sabor: " + sabor + " e Safra: " + safra);
    }
}