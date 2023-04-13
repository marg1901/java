public abstract class Vehicle {

        public String brand;
        public int kilometers;

        public Vehicle(String brand) {
            this.brand = brand;
            this.kilometers = kilometers;
        }

        public String getBrand() {
            return this.brand;
        }

        public void SetBrand(String brand) {
            this.brand = brand;
        }

         public int getKilometers() {
            return this.kilometers;
        }

        public void SetKilometers(int kilometers) {
            this.kilometers = kilometers;
    }

    public abstract String doStuff();
}