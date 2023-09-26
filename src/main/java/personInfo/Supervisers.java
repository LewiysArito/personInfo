package personInfo;

public class Supervisers extends DataPerson{
    protected int subdivision;
    public Supervisers(String FIO, int ageOfBorn, String numberPhone, String adress) {
        super(FIO, ageOfBorn, numberPhone, adress);
        this.status = "руководитель";
        PersonCount.employees ++;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + " " + this.subdivision;
    }

    public int getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(int subdivision) {
        this.subdivision = subdivision;
    }
}
