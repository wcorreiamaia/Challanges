package com.example.challanges.model2;

public class Specification {
    private String fund_main_strategy_name;
    private FundSuitabilityProfile fund_suitability_profile;
    private FundRiskProfile fund_risk_profile;
    private String fund_main_strategy_explanation;
    private String fund_type;
    private String fund_class;
    private FundMacroStratefy fund_macro_strategy;
    private String fund_class_anbima;
    private FundMainStrategy fund_main_strategy;
    private Boolean is_qualified;

    private static class FundSuitabilityProfile {
        private int score_range_order;
        private String name;
    }

    private static class FundRiskProfile {
        private int score_range_order;
        private String name;
    }

    private static class FundMacroStratefy {
        private String explanation;
        private int id;
        private String name;
    }

    private static class FundMainStrategy {
        private String explanation;
        private int fund_macro_strategy;
        private int id;
        private String name;
    }
}

