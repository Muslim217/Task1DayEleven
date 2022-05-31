public class Courier implements DoWorkAndBonus{
    int salary;
    boolean isPayed;
    WareHouse w;

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public Courier(WareHouse w) {
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
        salary+=100;
        w.incrementDelivere();



    }

    @Override
    public void Bonus() {
        if (w.countDeliveredOrders < 10000) {
            System.out.println("Бонус пока не доступен");
            return;
        }
        if (isPayed) {
            System.out.println("Бонус уже выплачен");
            return;
        } else {
            salary += 50000;
            isPayed = true;// показатель наличия выплаты бонуса
            return;

        }
    }
}


