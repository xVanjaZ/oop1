import java.util.ArrayList;

public class StringProcessor {
    private ArrayList<OpmaakProces> processen;

    public StringProcessor(){
        processen = new ArrayList<>();
    }

    public String verwerk(String input){
        String object = input;

        for (OpmaakProces proces : processen){
            object = proces.maakOp(object);
        }

        return object;
    }

    public void voegProcesToe(OpmaakProces proces){
        if (!processen.contains(proces)){
            processen.add(proces);
        }
    }
}
