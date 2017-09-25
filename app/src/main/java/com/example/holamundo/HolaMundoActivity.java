package com.example.holamundo;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Mi primera aplicación de Android
 * @author Carlos Cruz Domínguez
 * @version 1.0
 * @see android.app.Activity
 */

public class HolaMundoActivity extends AppCompatActivity {

    //Creamos un objeto TextView que apuntará a la dirección de memoria del TextView que se crea en el XML.
    private TextView txvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Llama al metodo de la clase padre onCreate.
        super.onCreate(savedInstanceState);
        //INFLA los objetos del XML en memoria, es decir, carga los objetos de los XML en memoria.
        setContentView(R.layout.activity_hola_mundo);
        //Buscamos la vista, el objeto, (el textview) por id y se la asignamos al objeto TextView que hemos creado. Nuestro TextView
        //apuntará al TextView que se ha creado a partir del XML.
        txvMessage = (TextView)findViewById(R.id.txvMessage);
        //Ahora que hemos conseguido apuntar al objeto que queriamos, le cambiamos el texto por el que queramos.
        txvMessage.setText(R.string.second_message);
    }
}
