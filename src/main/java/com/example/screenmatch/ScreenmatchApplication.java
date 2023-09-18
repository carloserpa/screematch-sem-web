package com.example.screenmatch;

import com.example.screenmatch.model.SerieData;
import com.example.screenmatch.service.ConsumeApi;
import com.example.screenmatch.service.DataConvert;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumeApi = new ConsumeApi();
        var json = consumeApi.getData("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
        System.out.println(json);
        DataConvert dataConvert = new DataConvert();
        SerieData serieData = dataConvert.getData(json, SerieData.class);
        System.out.println(serieData);

    }
}
