package com.ister.repository;

import com.ister.domain.TelemetryData;
import com.ister.domain.Things;
import com.ister.domain.User;

import java.util.List;

public class ThingsJdbcRepositoryImpl implements ThingsRepository{
    @Override
    public void create(Things thing) {

    }

    @Override
    public void delete(Things thing) {

    }

    @Override
    public void delete(List<Things> things){

    }

    @Override
    public List<Things> getAll() {
        return null;
    }

    @Override
    public List<TelemetryData> getAllRecords() {
        return null;
    }

    @Override
    public TelemetryData getThingRecord(Things thing) {
        return null;
    }

    @Override
    public Things findById(Long id) {
        return null;
    }

    @Override
    public Things findBySerialNumber(String serialNumber) {
        return null;
    }


    @Override
    public List<Things> findByUser(User user){
        return null;
    }
}
