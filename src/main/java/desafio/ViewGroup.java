package desafio;

import java.util.Arrays;

/**
 * Created by Formando on 19/05/2017.
 */
public abstract class ViewGroup extends View{
    private View[] children;
    private int numberOfChildren;
    private int initialCapacity;

    public ViewGroup(String id) {
        super(id);
        this.initialCapacity = 8;
        this.children = new View[initialCapacity];
    }

    public void addView(View v){
        if(children[children.length-1] != null ) {
            increaseCapacity();
        }
        children[numberOfChildren] = v;
        numberOfChildren++;
    }

    public boolean removeView(View v){
        int foundIndex = -1;
        int numberOfChildren = getNumberOfChildren();
        for(int i=0; i != numberOfChildren; i++) {
            if (children[i].equals(v)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            for(int i=foundIndex; i < numberOfChildren; i++) {
                children[i] = children[i+1];
            }
            setNumberOfChildren(numberOfChildren-1);
            return true;
        }
        else{
            return false;
        }
    }

    private void increaseCapacity(){
        /*
        View[] newChildren = new View[children.length + 2];
        newChildren = Arrays.copyOf(children, children.length);
        */
        //por exemplo, se o tamanho inicial foi de 2 posições, ficará com 4 posições, depois com 6 posições, etc..
    }

    public View[] getChildren() {
        return children;
    }

    public void setChildren(View[] children) {
        this.children = children;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getInitialCapacity() {
        return initialCapacity;
    }
}
