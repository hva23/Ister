package com.ister.domain;

import java.util.Map;

public class TelemetryData extends BaseEntity<Long> {
    private Map<String, Object> data;
    private Things thing;

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

    public Things getThing() {
        return thing;
    }

    public void setThing(Things thing) {
        this.thing = thing;
    }
}
