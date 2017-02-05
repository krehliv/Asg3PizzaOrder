package css.cis3334.asg3pizzaorder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton rbSmall;
    RadioButton rbMedium;
    RadioButton rbLarge;

    CheckBox cbCheese;
    CheckBox cbDelivery;

    TextView tvTotalBill;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbLarge = (RadioButton) findViewById(R.id.radioButtonLarge);
        rbMedium = (RadioButton) findViewById(R.id.radioButtonMedium);
        rbSmall = (RadioButton) findViewById(R.id.radioButtonSmall);

        cbCheese = (CheckBox) findViewById(R.id.checkBoxCheese);
        cbDelivery = (CheckBox) findViewById(R.id.checkBoxDelivery);

        tvTotalBill = (TextView) findViewById(R.id.textViewTotal);
    }

    public void onClickCalculateTotal(View view) {
        Double totalBill = 0.00;

        if (rbLarge.isChecked()) {
            totalBill += 13.00;
        }
        if (rbMedium.isChecked()) {
            totalBill += 9.00;
        }
        if (rbSmall.isChecked()) {
            totalBill += 7.00;
        }

        if (cbCheese.isChecked()) {
            totalBill += 1.75;
        }
        if (cbDelivery.isChecked()) {
            totalBill += 2.50;
        }

        Double roundedBill = Math.round(totalBill * 100.00) / 100.00;
        tvTotalBill.setText("Total is: $" + roundedBill.toString());
    }
}
