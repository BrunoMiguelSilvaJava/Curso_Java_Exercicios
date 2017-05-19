package desafio;

/**
 * Created by Formando on 19/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        VerticalLayout verticalLayout = new VerticalLayout("MyVerticalLayout1");
        HorizontalLayout horizontalLayout = new HorizontalLayout("MyHorizontalLayout1");

        Button button1 = new Button("MyButton1");
        TextView textView1 = new TextView("MyTextView1");
        EditText editText1 = new EditText("EditText1");

        Button button2 = new Button("MyButton2");
        TextView textView2 = new TextView("MyTextView2");
        EditText editText2 = new EditText("EditText2");

        verticalLayout.addView(button1);
        verticalLayout.addView(textView1);
        verticalLayout.addView(editText1);

        horizontalLayout.addView(button2);
        horizontalLayout.addView(textView2);
        horizontalLayout.addView(editText2);

        button1.setOnClickListener(new OnClickListener() {
            //@Override
            public void onClick(View v) {
                System.out.println(v.getId() + " clicked!");
            }
        });

        horizontalLayout.setOnClickListener(new OnClickListener() {

            //Override
            public void onClick(View v) {
                System.out.println("HorizontalLayout was clicked!");
            }
        });

        System.out.println(verticalLayout.getRepresentation());
        System.out.println(horizontalLayout.getRepresentation());

        button1.performClick();
        horizontalLayout.performClick();

        Button button3 = new Button("MyButton3");
        TextView textView3 = new TextView("MyTextView3");
        EditText editText3 = new EditText("EditText3");

        verticalLayout.addView(button3);
        verticalLayout.addView(textView3);
        verticalLayout.addView(editText3);

        System.out.println(verticalLayout.getRepresentation());

        System.out.println("Removeu: " + horizontalLayout.removeView(button3));
        System.out.println("Removeu: " + horizontalLayout.removeView(button2));

        System.out.println(horizontalLayout.getRepresentation());
    }
}
