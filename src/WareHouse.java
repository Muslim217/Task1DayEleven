public class WareHouse {
    int countPickedOrders; // количество собранных заказов
    int countDeliveredOrders; // количество доставленных заказов

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "countPickedOrders=" + countPickedOrders +
                ", countDeliveredOrders=" + countDeliveredOrders +
                '}';
    }
    public void IncrementPickedOrders(){
        countPickedOrders++;
    }
    public void incrementDelivere(){
        countDeliveredOrders++;
    }
}