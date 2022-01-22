package com.letscode.cafe;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public interface ICafe {
    void imprimirCardapio(String sabor, String safra) throws FileNotFoundException, UnsupportedEncodingException;
}
