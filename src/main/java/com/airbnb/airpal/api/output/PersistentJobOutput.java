package com.airbnb.airpal.api.output;

import com.airbnb.airpal.api.Job;
import com.airbnb.airpal.core.Persistor;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.net.URI;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
public interface PersistentJobOutput
{
    public String getType();

    public String getDescription();

    public URI getLocation();

    public String processQuery(String query);

    public Persistor getPersistor(Job job);
}
