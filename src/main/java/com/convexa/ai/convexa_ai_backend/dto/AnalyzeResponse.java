package com.convexa.ai.convexa_ai_backend.dto;

import lombok.Data;
import java.util.List;

@Data
public class AnalyzeResponse {

    private String summary;

    private String sentiment;

    private String insights;

    private Integer overallScore;

    private Integer communication;

    private Integer problemResolution;

    private Integer professionalism;

    private Integer customerSatisfaction;

    private List<String> strengths;

    private List<String> improvements;
}