public class Worker {
    protected String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2023;
        int birthyear = Integer.parseInt(birthDate.substring(6));
        return (currentYear - birthyear);
    }

    public double collectPay() {
        return 100.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
