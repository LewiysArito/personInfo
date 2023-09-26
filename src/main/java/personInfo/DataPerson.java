package personInfo;

public class DataPerson implements PersonInterface{
    protected String FIO;//нет необходимости ставить доступность, так как они доступны только классам, которые наследуют интерфейс
    protected String status;
    protected int ageOfBorn;
    protected String numberPhone;
    protected String adress;

    public DataPerson(String FIO, int ageOfBorn, String numberPhone, String adress) {
        this.FIO = FIO;
        this.ageOfBorn = ageOfBorn;
        this.numberPhone = numberPhone;
        this.adress = adress;
    }

    @Override
    public String getInfo() {
        return (this.FIO +" "+ this.status + " " + this.ageOfBorn + " " + this.numberPhone + " "+this.adress);
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public String getFIO() {
        return this.FIO;
    }

    public static class PersonCount {
        protected static int employees = 0;
        protected static int clients = 0;

        public static int getEmployees() {
            return employees;
        }

        public static int getClients() {
            return clients;
        }//нужно сделать публичный класс, чтобы можно было обращаться к методам внутри другого пакета
    }
}
