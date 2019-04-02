package br.edu.uniopet.imobiliaria.util;

import br.edu.uniopet.imobiliaria.model.Imobiliaria;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Convert {

    public static List<Imobiliaria> convertJson(){
        List<Imobiliaria> imobiliariaList = new ArrayList<>();

        Gson gson = new Gson();

        final Type IMOBILIARIA_TYPE = new TypeToken<List<Imobiliaria>>(){}.getType();

        JsonReader reader;

        try {
            //reader = new JsonReader(new FileReader("/home/ivinib/Documents/Windows7/Trabalho2/imobiliaria.json"));

            reader = new JsonReader(new FileReader("src/main/resources/json/imobiliaria.json"));

            imobiliariaList = gson.fromJson(reader,IMOBILIARIA_TYPE);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

       return imobiliariaList;
    }
}
