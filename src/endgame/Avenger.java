/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package endgame;

/**
 *
 * @author SAM
 */
public class Avenger extends Heroe {
    protected String equipo;
    
    public Avenger (String nombre, String poder, String arma, String equipo){
        super(nombre,poder,arma);
        this.equipo=equipo;
    }
    
    public void reunirse(){
        System.out.print(nombre+ " Se une al equipo" +equipo+ " de los Avengers" +"\n");
    }
}
