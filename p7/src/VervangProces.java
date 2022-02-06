public class VervangProces implements OpmaakProces {
    private String oud, nieuw;

    public VervangProces(String oud, String nieuw) {
        this.oud = oud;
        this.nieuw = nieuw;
    }

    @Override
    public String maakOp(String input) {
        return input.replace(oud, nieuw);
    }
}
