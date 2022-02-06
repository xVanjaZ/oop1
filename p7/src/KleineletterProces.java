public class KleineletterProces implements OpmaakProces{

    public KleineletterProces(){}

    @Override
    public String maakOp(String input){
        return input.toLowerCase();
    }
}