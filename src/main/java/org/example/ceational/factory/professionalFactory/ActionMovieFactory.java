package org.example.ceational.factory.professionalFactory;

public class ActionMovieFactory implements MovieFactoryInterface{
    @Override
    public HollyWoodMovie getHollyWoodMovie() {
        return new  ActionHolywoodMovie();
    }

    @Override
    public BollyWoodMovie getBollyWoodMovie() {
        return new ActionBollywoodMovie();
    }
}
