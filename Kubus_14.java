public class Kubus_14 {
        private double sisi;
        public Kubus_14(double sisi) {
            this.sisi = sisi;
        }
        public double hitungVolume() {
            return Math.pow(sisi, 3);
        }
        public double hitungLuasPermukaan() {
            return 6 * Math.pow(sisi, 2);
        }
        public static void main(String[] args) {
            Kubus_14 kubus = new Kubus_14(5);
            double volume = kubus.hitungVolume();
            System.out.println("Volume kubus adalah: " + volume);
            double luasPermukaan = kubus.hitungLuasPermukaan();
            System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
        }
    }
    

