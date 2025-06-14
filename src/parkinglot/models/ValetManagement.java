package parkinglot.models;

import java.util.List;

public class ValetManagement {
    List<Valet> valets;

    public List<Valet> getValets() {
        return valets;
    }

    public void setValets(List<Valet> valets) {
        this.valets = valets;
    }

    public ValetManagement(List<Valet> valets){
        this.valets = valets;
    }


}
