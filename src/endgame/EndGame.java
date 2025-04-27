/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package endgame;

/**
 *
 * @author SAM
 */
public class EndGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Heroe blackPanter=new Heroe(" Black Panter"," Ser rey de todo Wakanda"," Garras de Vibranium");
       Villano galactus= new Villano(" Galactus"," Devorar mundos"," usa de chalan a Silver Surfer");
       Avenger ironMan=new Avenger(" Tony Stark"," Filantropo, Multimillonario, Playboy"," Mark 42"," Prime");
       Thanos thanos=new Thanos(" Thanos"," El titan loco"," Ejercito Chitaury"," Guantelete del Infinito");
       
       //aplicando polimorfismo
       Personaje []personajes={blackPanter, galactus, ironMan, thanos};
       for (Personaje personaje:personajes){
           personaje.atacar();
       }
       
       //metodo especifico de avenger
       ((Avenger)ironMan).reunirse();
       
       //metodo especifico de Thanos
       thanos.chasquearDedos();
    }
    
}
