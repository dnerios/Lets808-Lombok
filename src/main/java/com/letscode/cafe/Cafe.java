package com.letscode.cafe;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Cafe implements ICafe{
    private String sabor;
    private String safra;
    private String aroma;

    public Cafe(String sabor, String safra, String aroma) {
        this.sabor = sabor;
        this.safra = safra;
        this.aroma = aroma;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSafra() {
        return safra;
    }

    public void setSafra(String safra) {
        this.safra = safra;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "sabor='" + sabor + '\'' +
                ", safra='" + safra + '\'' +
                ", aroma='" + aroma + '\'' +
                '}';
    }

    @Override
    public void imprimirCardapio(String sabor, String safra) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("cardapio-cafe.txt","UTF-8");
            writer.println("CARDÁPIO LET'S CODE");
            writer.println("Sabor: " + sabor + " e Safra: " + safra);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}