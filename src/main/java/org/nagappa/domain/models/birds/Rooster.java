package org.nagappa.domain.models.birds;

import org.nagappa.domain.abs.Animal;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Animal {
    private final Animal rooster = new Chicken();

    private String language = "English";

    public Rooster(){

    }
    public Rooster(String language){
        this.language = language;
    }
    private static final Map<String, String> lang;
    static
    {
        lang = new HashMap<>();
        lang.put("Danish", "kykyliky");
        lang.put("Dutch", "kukeleku");
        lang.put("Finnish", "kukko kiekuu");
        lang.put("French", "cocorico");
        lang.put("German", "kikeriki");
        lang.put("Greek", "kikiriki");
        lang.put("Hebrew", "coo-koo-ri-koo");
        lang.put("Hungarian", "kukuriku");
        lang.put("Italian", "chicchirichi");
        lang.put("Japanese", "ko-ke-kok-ko-o");
        lang.put("Portuguese", "cucurucu");
        lang.put("Russian", "kukareku");
        lang.put("Swedish", "kuckeliku");
        lang.put("Turkish", "kuk-kurri-kuuu");
        lang.put("Urdu", "kuklooku");
        lang.put("English", "Cock-a-doodle-doo");
    }
    @Override
    public boolean sing(){
        System.out.println(lang.get(language));
        return true;
    }

    @Override
    public boolean swim(){
        return rooster.swim();
    }

    @Override
    public boolean fly(){
        return rooster.fly();
    }

    @Override
    public boolean walk(){
        return rooster.walk();
    }

    public String getLanguage() {
        return language;
    }
}
