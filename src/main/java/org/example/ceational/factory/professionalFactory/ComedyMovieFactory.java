package org.example.ceational.factory.professionalFactory;

public class ComedyMovieFactory implements MovieFactoryInterface{
    @Override
    public HollyWoodMovie getHollyWoodMovie() {
        return new ComedyHollywoodMovie();
    }

    @Override
    public BollyWoodMovie getBollyWoodMovie() {
        return new ComedyBollywoodMovie();
    }
}
