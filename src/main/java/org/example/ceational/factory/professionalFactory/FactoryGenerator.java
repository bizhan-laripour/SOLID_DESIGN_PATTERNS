package org.example.ceational.factory.professionalFactory;

public class FactoryGenerator {

    public static MovieFactoryInterface createMovieFactory(String movieType) {
        return switch (movieType) {
            case "Comedy" -> new ComedyMovieFactory();
            case "Action" -> new ActionMovieFactory();
            default -> null;
        };
    }
}
