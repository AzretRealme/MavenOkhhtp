package models;

import java.util.List;

public class Object {

    private String product;
    private String init;
    private List<DataSeries> dataseries;

    public Object(String product, String init, List<DataSeries> dataseries) {
        this.product = product;
        this.init = init;
        this.dataseries = dataseries;
    }

    public Object(){
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    public List<DataSeries> getDataseries() {
        return dataseries;
    }

    public void setDataseries(List<DataSeries> dataseries) {
        this.dataseries = dataseries;
    }
    @Override
    public String toString() {
        return "Object" + "\n" +
                "product: " + product + '\n' +
                "init: " + init + '\n' +
                "dataSeries: " + "\n" + dataseries + '\n';
    }
}
