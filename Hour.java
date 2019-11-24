public class Hour implements Salary {
    @Override
    public void salsry() {
        double salHour = 1500/30+500+15*1.75;
        System.out.println("Money per month per hour : " + salHour);
    }
}
