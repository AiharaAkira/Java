import java.util.ArrayList;
import java.util.HashMap;

public class PokeBag {

    private final HashMap<String, ArrayList<Pokemon>> pokemons = new HashMap<>();

    public ArrayList<Pokemon> getPokemons(String name) {
        return pokemons.get(name);
    }

    public void add(Pokemon pokemon) {
        String name = pokemon.name;

        // �ش��ϴ� ArrayList�� ������ ����
        if (getPokemons(name) == null) {
            pokemons.put(name, new ArrayList<Pokemon>());
        }

        getPokemons(name).add(pokemon);
    }

    public Pokemon getStrongest(String name) {
        // name �̸��� ���ϸ� ���
        ArrayList<Pokemon> pokemonList = getPokemons(name);

        if (pokemonList == null) {
            return null;
        }

        // return�� ���ϸ�(���� �� ���ϸ�)�� ���� ����.
        Pokemon strongest = null;

        for (Pokemon pokemon : getPokemons(name)) {
            if (strongest == null || pokemon.cp > strongest.cp) {
                strongest = pokemon;
            }
        }

        return strongest;
    }

    public Pokemon getStrongest() {
        // return�� ���ϸ�(���� �� ���ϸ�)�� ���� ����.
        Pokemon strongest = null;

        // HashMap ��ü�� Ž�� (keySet�� ���� ���� key�� Ž��)
        for (String key : pokemons.keySet()) {
            // key�� �ش��ϴ� ���� �� ���ϸ��� ��������
            Pokemon p = getStrongest(key);

            // strongest�� ���� �� ���ϸ����� ��ü
            if (strongest == null || p.cp > strongest.cp) {
                strongest = p;
            }
        }

        return strongest;
    }

}