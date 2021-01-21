package com.cwang81.job.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoryRequestBody {

    @JsonProperty("user_id")
    public String userId;

    public Item favorite;
}