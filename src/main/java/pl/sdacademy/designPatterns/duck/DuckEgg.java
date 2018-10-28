package pl.sdacademy.designPatterns.duck;

public class DuckEgg {

    private final Double yolkWeight;
    private final Double whiteWeight;
    private final Double totalWeight;

    private DuckEgg(Double yolkWeight, Double whiteWeight, Double totalWeight) {
        this.yolkWeight = yolkWeight;
        this.whiteWeight = whiteWeight;
        this.totalWeight = totalWeight;
    }


    public Double getYolkWeight() {
        return yolkWeight;
    }

    public Double getWhiteWeight() {
        return whiteWeight;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "DuckEgg{" +
                "yolkWeight=" + yolkWeight +
                ", whiteWeight=" + whiteWeight +
                ", totalWeight=" + totalWeight +
                '}';
    }

    public static class Builder {
        private Double yolkWeight;

        public void setYolkWeight(Double yolkWeight) {
            this.yolkWeight = yolkWeight;

        }

        public DuckEgg build() {
            Double calculatedYolk = yolkWeight != null ? yolkWeight : 0D;
            Double calculatedWhiteWeight = Math.max(calculatedYolk * 1.2, 31D);
            Double calculatedMembraneWeight = (calculatedYolk + calculatedWhiteWeight) * 0.005;
            Double calculatedShellWeight = calculatedWhiteWeight * 0.07;
            if (calculatedShellWeight < 3D) {
                calculatedShellWeight = 3D;
            }
            Double totalWeight = calculatedYolk + calculatedMembraneWeight + calculatedShellWeight + calculatedWhiteWeight;

            return new DuckEgg(calculatedYolk, calculatedWhiteWeight, totalWeight);
         /*   Double whiteWeight = calculatedYolk *1.2;
            if (whiteWeight < 31D){
                whiteWeight = 31D;
            }
            if(yolkWeight == null) {
                0;

        }*/
        }
    }
}
