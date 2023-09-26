package personInfo;

public class Clients extends DataPerson{
    public Clients(String FIO, int ageOfBorn, String numberPhone, String adress) {
        super(FIO, ageOfBorn, numberPhone, adress);
        this.status = "клиент";
        PersonCount.clients ++;
    }
}
