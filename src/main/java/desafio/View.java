package desafio;

/**
 * Created by Formando on 19/05/2017.
 */
public abstract class View {
    private OnClickListener onClickListener;
    private String id;

    public View(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public abstract String getName();

    public abstract String getRepresentation();

    public void performClick(){
        onClickListener.onClick(this);
    }
}
