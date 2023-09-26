package personInfo;

public class Jobs extends DataPerson{
    protected int subdivision;
    public Jobs(String FIO, int ageOfBorn, String numberPhone, String adress, int subdivision) {
        super(FIO, ageOfBorn, numberPhone, adress);
        this.status = "работник";
        this.subdivision = subdivision;
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
