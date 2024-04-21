/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session04_calculadora.entidades;

/**
 *
 * @author Leo
 */
public class Calculadora {
    private float valor1;
    private float valor2;

    public Calculadora() {
    }

    public Calculadora(float valor1, float valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    
    public float sumar(){
        float suma;
        suma = this.valor1 + this.valor2;
        return suma;
    }
    
    public float restar(){
        float resta;
        resta = this.valor1 - this.valor2;
        return resta;
    }
    
    public float multiplicar(){
        float producto;
        producto = this.valor1 * this.valor2;
        return producto;
    }
    
    public float dividir(){
        float cociente;
        cociente = this.valor1 / this.valor2;
        return cociente;
    }
}
