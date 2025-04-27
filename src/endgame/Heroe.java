/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package endgame;

/**
 *
 * @author SAM
 */
public class Heroe extends Personaje {
    protected String arma;
    
    public Heroe (String nombre, String poder, String arma){
        super(nombre,poder);
        this.arma=arma;
    }
    
    @Override
    public void atacar(){
        System.out.print(nombre+ " Realiza ataque con el arma"+ arma+"!"+ "\n" );
    }
}
