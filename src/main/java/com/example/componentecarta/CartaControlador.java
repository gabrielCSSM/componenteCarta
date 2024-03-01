package com.example.componentecarta;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CartaControlador {
    @FXML
    VBox fondo;
    @FXML
    ImageView cartaImagen;

    public VBox getFondo() {
        return fondo;
    }

    public ImageView getCartaImagen() {
        return cartaImagen;
    }
}