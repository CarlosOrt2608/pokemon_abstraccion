package pokemon;

public class PokemonHielo extends Pokemon{
    public PokemonHielo(String nombre, int nivel) {
        super(nombre,Tipo.HIELO, nivel);


        ListaMovimientos listaMovimientos = new ListaMovimientos();

        setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Gruñido"));
        setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Pistola Agua"));
        setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Rayo Confuso"));
        setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Canto Helado"));
    }
    @Override
    public double obtenerEfectividad(Pokemon pokemon){
        double efectividad = 1.0;

        if(pokemon.getTipo()== Tipo.LUCHA) efectividad = 0.5;
        if(pokemon.getTipo()== Tipo.FUEGO) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.ROCA) efectividad = 2.0;
        if(pokemon.getTipo()== Tipo.ELECTRICO) efectividad = 05;
        if(pokemon.getTipo()== Tipo.PLANTA) efectividad = 0.5;
        
        return efectividad;
    }
}




