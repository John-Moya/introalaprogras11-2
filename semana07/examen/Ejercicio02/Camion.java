/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana07.examen.Ejercicio02;

/**
 *
 * @author alexe
 */
public class Camion {
    private  String placa, marca, modelo, pesoDeCarga;

    public Camion (String placa) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.pesoDeCarga = pesoDeCarga;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPesoDeCarga() {
        return pesoDeCarga;
    }

    public void setPesoDeCarga(String pesoDeCarga) {
        this.pesoDeCarga = pesoDeCarga;
    }
}
