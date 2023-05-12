public class Main {


    public static void main(String[] args) {

       // Author one = new Author("Маргарет", "Митчелл");
        Author authorOne = new Author("Маргарет", "Митчелл");
        Book GoneWithTheWind = new Book("Унесённые ветром", authorOne , 1936);

        System.out.println("GoneWithTheWind.nameOfBook = " + GoneWithTheWind.getNameOfBook());

        System.out.println("GoneWithTheWind.authorOfBook = " + authorOne.getFirstName()+ " " + authorOne.getLastName());

        System.out.println("GoneWithTheWind.yearPublication = " + GoneWithTheWind.getYearPublication());

        GoneWithTheWind.setYearPublication(2023);
        System.out.println("GoneWithTheWind.getYearPublication() = " + GoneWithTheWind.getYearPublication());

        System.out.println();

        Author authorTwo = new Author("Джордж", "Оруэлл");
        Book AnimalFarm = new Book("Скотный двор", authorTwo, 1945);


        System.out.println("AnimalFarm.nameOfBook = " +AnimalFarm.getNameOfBook());

        System.out.println("AnimalFarm.authorOfBook = " + authorTwo.getFirstName()+ " " + authorTwo.getLastName());

        System.out.println("AnimalFarm.yearPublication = " + AnimalFarm.getYearPublication());

        AnimalFarm.setYearPublication(2023);
        System.out.println("AnimalFarm.getYearPublication() = " + AnimalFarm.getYearPublication());

    }
}




