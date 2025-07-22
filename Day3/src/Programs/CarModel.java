package Programs;

public class CarModel {
    class CarModel1 {
        private String model;
        private int year;

        public void setModel(String model, int year) {
            this.model = model;
            this.year = year;
        }

        public String getModel() {
            return model;
        }

        public int getyear() {
            return year;
        }
    }

    public static void main(String[] args) {
        CarModel c = new CarModel();                  // Create an instance of the outer class
        CarModel1 c1 = c.new CarModel1();             // Create an instance of the inner class

        c1.setModel("Audi", 2003);                    // Use the inner class instance to set values
        System.out.println("Model name is " + c1.getModel());
        System.out.println("Year is :" + c1.getyear());
    }
}
