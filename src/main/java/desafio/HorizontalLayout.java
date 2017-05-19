package desafio;

/**
 * Created by Formando on 19/05/2017.
 */
public class HorizontalLayout extends ViewGroup{
    public HorizontalLayout(String id) {
        super(id);
    }

    @Override
    public String getRepresentation(){
        View[] children = getChildren();
        String tempChildren = "";
        for(int i=0; i != children.length; i++){
            if(children[i] != null)
                tempChildren += "  " + children[i].getName() + " (" + children[i].getId() +  ")" + ",";
            else if (i != children.length - 1)
                tempChildren += "  " + "null" + ",";
            else
                tempChildren += "  " + "null";
        }

        return String.format(getName() + ": " + "[" + tempChildren + " ]\n");
    }

    public String getName() {
        return "HorizontalLayout";
    }
}
