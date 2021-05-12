package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataSeries {

    private int timepoint;
    private int cloudcover;
    private int seeing;
    private int transparency;
    private int lifted_index;
    private int rh2m;
    private Wind10M wind10m;
    private int temp2m;
    private String prec_type;

    public DataSeries(){
    }

    public DataSeries(int timepoint, int cloudcover, int seeing, int transparency, int lifted_index, int rh2m, Wind10M wind10m, int temp2m, String prec_type) {
        this.timepoint = timepoint;
        this.cloudcover = cloudcover;
        this.seeing = seeing;
        this.transparency = transparency;
        this.lifted_index = lifted_index;
        this.rh2m = rh2m;
        this.wind10m = wind10m;
        this.temp2m = temp2m;
        this.prec_type = prec_type;
    }

    public int getTimepoint() {
        return timepoint;
    }

    public void setTimepoint(int timepoint) {
        this.timepoint = timepoint;
    }

    public int getCloudcover() {
        return cloudcover;
    }

    public void setCloudcover(int cloudcover) {
        this.cloudcover = cloudcover;
    }

    public int getSeeing() {
        return seeing;
    }

    public void setSeeing(int seeing) {
        this.seeing = seeing;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public int getLifted_index() {
        return lifted_index;
    }

    public void setLifted_index(int lifted_index) {
        this.lifted_index = lifted_index;
    }

    public int getRh2m() {
        return rh2m;
    }

    public void setRh2m(int rh2m) {
        this.rh2m = rh2m;
    }

    public Wind10M getWind10m() {
        return wind10m;
    }

    public void setWind10m(Wind10M wind10m) {
        this.wind10m = wind10m;
    }

    public int getTemp2m() {
        return temp2m;
    }

    public void setTemp2m(int temp2m) {
        this.temp2m = temp2m;
    }

    public String getPrec_type() {
        return prec_type;
    }

    public void setPrec_type(String prec_type) {
        this.prec_type = prec_type;
    }

    @Override
    public String toString() {
        return "\n" + "DataSeries{" +
                "timepoint=" + timepoint +
                ", cloudcover=" + cloudcover +
                ", seeing=" + seeing +
                ", transparency=" + transparency +
                ", lifted_index=" + lifted_index +
                ", rh2m=" + rh2m +
                ", wind10m=" + wind10m +
                ", temp2m=" + temp2m +
                ", prec_type='" + prec_type + '\'' +
                '}' + "\n";
    }
}
