package pokemon;

public class PokemonFuego extends Pokemon{
    public PokemonFuego(String nombre, int nivel) {
        super(nombre, Tipo.FUEGO, nivel);




        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Trajo Areo"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Arañoso"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Ascuas"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Garra Dragon"));
    }
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;

        if(pokemon.getTipo()== Tipo.PLANTA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.ROCA) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.HIELO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.ELECTRICO) efectividad = 0.5;
        
        return efectividad;
    }
}
