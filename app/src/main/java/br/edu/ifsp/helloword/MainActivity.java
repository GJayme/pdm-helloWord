package br.edu.ifsp.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText numeroEditText;
    private Button botaoButton;
    private Spinner opcoesSpinner;
    private RadioButton primerioRadioButton;
    private RadioButton segundoRadioButton;
    private CheckBox checadoCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numeroEditText = findViewById(R.id.numeroEt);
        botaoButton = findViewById(R.id.botaoBt);
        botaoButton.setOnClickListener(this);

        opcoesSpinner = findViewById(R.id.opcoesSp);
        primerioRadioButton = findViewById(R.id.primeiroRb);
        segundoRadioButton = findViewById(R.id.segundoRb);
        checadoCheckBox = findViewById(R.id.checadoCb);
    }

    @Override
    public void onClick(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(numeroEditText.getText().toString());
        sb.append("\n");
        sb.append(((TextView)opcoesSpinner.getSelectedView()).getText());
        sb.append("\n");
        sb.append(primerioRadioButton.isChecked()?"primeiro":"segundo");
        sb.append("\n");
        sb.append(checadoCheckBox.isChecked()?"checado":"não checado");

        if (view.getId() == R.id.botaoBt) {
            Toast.makeText(this, sb, Toast.LENGTH_SHORT).show();
        }
    }
}