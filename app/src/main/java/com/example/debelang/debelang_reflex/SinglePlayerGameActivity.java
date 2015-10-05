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
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Random;
import java.util.Timer;

public class SinglePlayerGameActivity extends Activity {
    private ReactionTimes reactionTimes = new ReactionTimes();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_player_mode);
        final Button clickButton = (Button) findViewById(R.id.ReactionButton);

        //Waits for the users click and then records how long it took them to respond after the prompt
        clickButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Random generator = new Random();
                int i = generator.nextInt(2000);
                final Measurement measurement = new Measurement();
                try{
                    //Puts the program to sleep for between 0 to 2000ms
                    Thread.sleep(i);
                }catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }




            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_single_player_game, menu);
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
