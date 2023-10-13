
import pokemon.PokemonFuego;
import pokemon.PokemonHielo;

public class BatallaPokemon {

     public static void main(String[] args) {
        
        
        PokemonFuego charizard = new PokemonFuego("charizard", 10);
        PokemonHielo lapras = new PokemonHielo("lapras", 10);

       
        charizard.atacar(0, lapras);
        System.out.println("\n");
        lapras.atacar(6, charizard);
       
    }
}