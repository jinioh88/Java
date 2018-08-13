package ch02;

public class Invoice {
    public static class Item {
        private String descript;
        private int quantity;
        private double unitPrice;

        public Item(String descript, int quantity, double unitPrice) {
            this.descript = descript;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double price() {
            return quantity* unitPrice;
        }
    }

    public static void main(String[] args) {
        Invoice.Item newItem = new Invoice.Item("aaa",2,2000);
    }
}
