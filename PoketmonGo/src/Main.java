public class Main {
    public static void main(String[] args) {
        PokeBag pokeBag = new PokeBag();

        pokeBag.add(new Pokemon("���׸�", 1024));
        pokeBag.add(new Pokemon("���׸���", 215));
        pokeBag.add(new Pokemon("����", 816));
        pokeBag.add(new Pokemon("���׸���", 136));
        pokeBag.add(new Pokemon("������", 1822));
        pokeBag.add(new Pokemon("����", 215));
        pokeBag.add(new Pokemon("����", 185));
        pokeBag.add(new Pokemon("����", 110));
        pokeBag.add(new Pokemon("�ϵ�ŷ", 1709));
        pokeBag.add(new Pokemon("����", 39));
        pokeBag.add(new Pokemon("���ڿ�", 12));

        System.out.println(pokeBag.getStrongest("����"));
        System.out.println(pokeBag.getStrongest());
        System.out.println(pokeBag.getStrongest("��ī��"));
    }
}