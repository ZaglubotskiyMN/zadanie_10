package part1.lessons10.task1;

public class road{
    private String ofroad;
    road(String ofroad){
        this.setOfroad(ofroad);
    }
    public void road(String ofroad) throws Exception {
        //if (ofroad == "Дорога на ремонте") throw new Exception("Объезд");
    }

    public String getOfroad() throws MyException {
        if (ofroad == "Дорога на ремонте") throw new MyException ("Объезд");
        return ofroad;
    }

    public void setOfroad(String ofroad) {
        this.ofroad = ofroad;
    }
}