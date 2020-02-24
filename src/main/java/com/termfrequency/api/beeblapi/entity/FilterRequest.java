package com.termfrequency.api.beeblapi.entity;

import lombok.Data;

@Data
public class FilterRequest {
    private String url;
    private String textToProcess;
}
