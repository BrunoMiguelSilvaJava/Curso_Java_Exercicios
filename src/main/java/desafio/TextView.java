package desafio;

/**
 * Created by Formando on 19/05/2017.
 */
public class TextView extends View{
    public TextView(String id) {
        super(id);
    }

    @Override
    public String getRepresentation() {
        return null;
    }

    public String getName() {
        return "TextView";
    }
}
