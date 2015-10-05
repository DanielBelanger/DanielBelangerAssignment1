/*
debelang-reflex: Allows the user to train their reaction times or play with friends
and the first person to answer will be recorded.

Copyright (c) 2015 Daniel Belanger  debelang@ualberta.ca

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as Published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public license for more details.

You should have received a copy of the GNU General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.example.debelang.debelang_reflex;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MultiplayerSelectionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplayer_selection);

        //assigns the buttons for the different player modes
        Button twoPlayerButton = (Button) findViewById(R.id.TwoPlayerButton);
        Button threePlayerButton = (Button) findViewById(R.id.ThreePlayerButton);
        Button fourPlayerButton = (Button) findViewById(R.id.FourPlayerButton);

        //sends the user to the two player mode
        twoPlayerButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TwoPlayerAcitivity.class);
                startActivity(intent);

            }
        });

        //sends the user to the three player mode
        threePlayerButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ThreePlayerActivity.class);
                startActivity(intent);

            }
        });

        //sends the user to the four player mode
        fourPlayerButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FourPlayerActivity.class);
                startActivity(intent);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_multiplayer_selection, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
