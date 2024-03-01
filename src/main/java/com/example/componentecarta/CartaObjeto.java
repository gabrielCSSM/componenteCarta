package com.example.componentecarta;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CartaObjeto {
    private int valor;
    private Image img;
    private String palo;
    private String carta;
    private boolean descubierta;

    public CartaObjeto(String palo, String carta) {
        this.carta = carta;
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    public boolean isDescubierta() {
        return descubierta;
    }

    public void setDescubierta(boolean descubierta) {
        this.descubierta = descubierta;
    }

    @Override
    public String toString() {
        return carta + " de " + palo;
    }
}

