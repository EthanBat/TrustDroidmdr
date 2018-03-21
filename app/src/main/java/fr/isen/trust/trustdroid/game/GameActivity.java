package fr.isen.trust.trustdroid.game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import fr.isen.trust.trustdroid.R;
import fr.isen.trust.trustdroid.model.GameAdvancement;
import fr.isen.trust.trustdroid.model.ListPlayer;

public class GameActivity extends AppCompatActivity {

    private ListPlayer listPlayer;
    private TextView out;
    private GameAdvancement gameAdvancement;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        out = findViewById(R.id.out);
        Bundle bundle = getIntent().getExtras();
        listPlayer = null;
        //StringBuilder list = new StringBuilder();

        if (bundle != null)
            {
            listPlayer = ((ListPlayer) getIntent().getExtras().getSerializable("list player"));
            gameAdvancement = new GameAdvancement(listPlayer, 2, 0, 3, -1);
            out.setText(gameAdvancement.getPlayers().getPlayer(0).getUsername());
            }
        else
            Toast.makeText(GameActivity.this,"bundle est null", Toast.LENGTH_SHORT).show();

    }
}
