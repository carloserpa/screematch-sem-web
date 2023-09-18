package com.example.screenmatch.service;

import com.example.screenmatch.model.SerieData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConvert implements IDataConvert{
    ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T getData(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
