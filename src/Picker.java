public class Picker implements DoWorkAndBonus{
    int salary;
    boolean isPayed = false;
    WareHouse w;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Picker(WareHouse w) {
        this.w=w;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }
    @Override
    public void doWork() {
        salary+=80;
        w.IncrementPickedOrders();

    }

    @Override
    public void Bonus() {
        if (w.countPickedOrders<10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed){
            System.out.println("Бонус уже выплачен");
            return;
        }
        else {
            salary+=70000;
            isPayed = true;// показатель наличия выплаты бонуса
            return;
        }

    }
}
