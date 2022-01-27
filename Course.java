package lab10.hashSetAssignment;

public class Course {
    private String  cId;
    private String  cName;
    private int     creditHours;

    public Course(String cId, String cName, int creditHours) {
        this.cId = cId;
        this.cName = cName;
        this.creditHours = creditHours;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", creditHours=" + creditHours +
                '}';
    }
}
