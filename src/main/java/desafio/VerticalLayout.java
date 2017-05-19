package desafio;

/**
 * Created by Formando on 19/05/2017.
 */
public class VerticalLayout extends ViewGroup{
    public VerticalLayout(String id) {
        super(id);
    }

    @Override
    public String getRepresentation() {
        View[] children = getChildren();
        String tempChildren = "\n";
        for(int i=0; i != children.length; i++){
            if(children[i] != null)
                tempChildren += "  " + children[i].getName() + "(" + children[i].getId() +  ")" + ",\n";
            else if (i != children.length - 1)
                tempChildren += "  " + "null" + ",\n";
            else
                tempChildren += "  " + "null\n";
        }

        return String.format(getName() + "\n" + "[" + tempChildren + "]\n");
    }

    public String getName() {
        return "VerticalLayout";
    }
}
