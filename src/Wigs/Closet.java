package Wigs;

public class Closet {
    public static class Shelf { //Static nested class
        private static int amountOfClothes;

        public static void loadWig() {
            amountOfClothes += 1;
            System.out.println("Парик положили на полку. Теперь на полке " + amountOfClothes + " париков.");
        }

        public static void takeWig() {
            if (amountOfClothes > 0) {
                amountOfClothes -= 1;
                System.out.println("Парик взяли с полки. Теперь на полке " + amountOfClothes + " париков.");
            }
            else {
                System.out.println("На полке нет париков, чтобы их достать!");
            }

        }
    }
}
