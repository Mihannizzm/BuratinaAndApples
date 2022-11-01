public class BuratinaAndApples {

    public static void main(String[] args) {

        final int quantityApllesAtBuratina = 12;
        System.out.println("Количество яблок у Буратино: " + quantityApllesAtBuratina);
        final int karabasTookApplesAtBuratina = 4;
        System.out.println("Карабас Барабас отобрал у Буратино " + karabasTookApplesAtBuratina + " яблока");
        final int leftApllesAtBuratina = quantityApllesAtBuratina - karabasTookApplesAtBuratina;
        System.out.println("Осталось яблок у Буратино: " + leftApllesAtBuratina);

    }
}
