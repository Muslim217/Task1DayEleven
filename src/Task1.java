public class Task1{
    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse();
        Picker picker1 = new Picker(wareHouse);
        Courier courier1 = new Courier(wareHouse);
        businessProcess(picker1);
        businessProcess(courier1);
        System.out.println(courier1.getSalary());
        System.out.println(picker1.getSalary() );

    }



    static void businessProcess (DoWorkAndBonus worker){
        for(int i = 0; i<20000;i++){
            worker.doWork();
        }
        worker.Bonus();


    }
}

