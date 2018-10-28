package pl.sdacademy.designPatterns.duck;

public class Fodder {
    private Integer cornGrams;
    private Integer wheatGrams;
    private Integer triticaleGrams;
    private Integer oatGrams;
    private Boolean minerals;
    private Boolean vitamins;

    private Fodder(Builder builder) {
        cornGrams = builder.cornGrams;
        oatGrams = builder.oatGrams;
        triticaleGrams = builder.triticaleGrams;
        wheatGrams = builder.wheatGrams;
        minerals = builder.minerals;
        vitamins = builder.vitamins;
        //wartosci z Buildera
    }
public  static Builder builder (Integer cornGrams, Integer wheatGrams){
        if (cornGrams == null || cornGrams <0){
           throw  new IllegalArgumentException("Corn must be provided");
        }
    if (wheatGrams == null || wheatGrams <0){
        throw new IllegalArgumentException("Wheat must be provided");
    }
        return  new Builder(cornGrams, wheatGrams);
}

    public Integer getCornGrams() {
        return cornGrams;
    }

    public Integer getWheatGrams() {
        return wheatGrams;
    }

    public Integer getTriticaleGrams() {
        return triticaleGrams;
    }

    public Integer getOatGrams() {
        return oatGrams;
    }

    public Boolean getMinerals() {
        return minerals;
    }

    public Boolean getVitamins() {
        return vitamins;
    }

    public static class Builder {
        private final Integer cornGrams;
        private final Integer wheatGrams;
        private Integer triticaleGrams;
        private Integer oatGrams;
        private Boolean minerals;
        private Boolean vitamins;

        private Builder(Integer cornGrams, Integer wheatGrams) {
            this.cornGrams = cornGrams;
            this.wheatGrams = wheatGrams;

        }

       /* public Builder cornGrams(Integer cornGrams) {
            this.cornGrams = cornGrams;
            return this;
        }

        public Builder wheatGrams(Integer wheatGrams) {
            this.wheatGrams = wheatGrams;
            return this;
        }*/

        public Builder triticaleGrams(Integer triticaleGrams) {
            this.triticaleGrams = triticaleGrams;
            return this;
        }

        public Builder oatGrams(Integer oatGrams) {
            this.oatGrams = oatGrams;
            return this;
        }

        public Builder vitamins(Boolean vitamins) {
            this.vitamins = vitamins;
            return this;
        }

        public Builder minerals(Boolean minerals) {
            this.minerals = minerals;
            return this;
        }

        public Fodder build() {
            return new Fodder(this);
        }

    }
}
