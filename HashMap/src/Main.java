public class Main {
    public static void main(String[] args) {
        WordDictionary dictionary = new WordDictionary();
        dictionary.addWord("Movie", "��ȭ");
        dictionary.addWord("cat", "�����");
        dictionary.addWord("Dog", "��");
        dictionary.addWord("book", "å");
        dictionary.addWord("soap", "��");
        dictionary.addWord("Glasses", "�Ȱ�");

        System.out.println(dictionary.find("Book"));
        System.out.println(dictionary.find("glasses"));
    }
}