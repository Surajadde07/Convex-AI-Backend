package com.convexa.ai.convexa_ai_backend.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QualityScoreResponse {

    private Integer overallScore;

    private Integer communication;

    private Integer problemResolution;

    private Integer professionalism;

    private Integer customerSatisfaction;

    private List<String> strengths;

    private List<String> improvements;
}