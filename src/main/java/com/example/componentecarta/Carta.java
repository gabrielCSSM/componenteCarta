package com.example.componentecarta;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class Carta extends VBox {
    private CartaControlador controlador;
    private CartaObjeto carta;
    private Image oculta = new Image(String.valueOf(getClass().getResource("secret_card.png")));

    public Carta(CartaObjeto c) {
        super();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("carta.fxml"));
            this.controlador = new CartaControlador();
            loader.setController(this.controlador);
            Node node = loader.load();
            this.getChildren().add(node);
            establecerCarta(c);
            this.iniciar(c.getImg());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void iniciar(Image i) {
        controlador.getCartaImagen().setFitHeight(130);
        controlador.getCartaImagen().setFitWidth(90);
        controlador.getCartaImagen().setImage(i);
    }

    public void establecerCarta(CartaObjeto c) {
        this.carta = c;
    }

    public void cambiarEstado(boolean b) {
        if (b) {
            controlador.getCartaImagen().setImage(carta.getImg());
        } else {
            controlador.getCartaImagen().setImage(oculta);
        }
    }

    public CartaObjeto devolverCarta() {
        return carta;
    }
}