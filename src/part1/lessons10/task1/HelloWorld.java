package part1.lessons10.task1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        int[] array =new int[3];


        try {
            array[4]=15;
            }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException"+" "+ "Текст ошибки:"+ " "+e.getMessage());
        }

        try{
            throw null;
        }catch (NullPointerException e){
        System.out.println("NullPointerException"+" "+"Текст ошибки:"+ " "+e.getMessage());
        }
        try{
            road bad=new road("Дорога на ремонте");
            System.out.println(bad.getOfroad());

        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }

}
    static class road{
        private String ofroad;
        road(String ofroad){
            this.setOfroad(ofroad);
        }
        public void road(String ofroad) throws Exception {
         if (ofroad == "Дорога на ремонте") throw new Exception("Объезд");
        }

        public String getOfroad() {
            return ofroad;
        }

        public void setOfroad(String ofroad) {
            this.ofroad = ofroad;
        }
    }
}

