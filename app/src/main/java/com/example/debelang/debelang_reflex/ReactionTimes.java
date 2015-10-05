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

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by debelang on 10/4/15.
 */
public class ReactionTimes{
    //sets initial min and max values high/low enough that the first value entered will take both places
    private long minValue = 1000000000;
    private long maxValue = 0;

    //creates a new array list to keep measurements
    private ArrayList<Measurement> reactionTimeList = new ArrayList<>();

    //adds a measurement to the list and updates the min/max reaction times
    public void addReactionTime(Measurement measurement){
        this.updateMaxValue(measurement.reactionTime());
        this.updateMinValue(measurement.reactionTime());
        reactionTimeList.add(measurement);

    }

    //returns the min reaction time
    public long minValue(){
        return this.minValue;
    }

    //updates the min value
    public void updateMinValue(long value){
        if (value < this.minValue){
            this.minValue = value;
        }
    }

    //updates the max value
    public void updateMaxValue(long value){
        if (value > this.maxValue){
            this.maxValue = value;
        }
    }

    //calculates the average value of all reaction times
    public long avgValue(){
        long avg = 0;
        for(int i = 0; i<reactionTimeList.size(); i++){
            avg+=(reactionTimeList.get(i)).reactionTime();
        }
        return avg/reactionTimeList.size();
    }

    //calculates the average value of the last 10 reaction times
    public long avg10Value() {
        long avg10 = 0;
        //if there are less than 10 total reaction times calculates the average from what is there
        if (reactionTimeList.size() < 10) {
            for (int i = 0; i < reactionTimeList.size(); i++) {
                avg10 += (reactionTimeList.get(i)).reactionTime();
            }
            return avg10 / reactionTimeList.size();
        } else {
            //if there are at least 10 reaction times calculates the average of the last 10
            for (int i = (reactionTimeList.size() - 10); i < reactionTimeList.size(); i++) {
                avg10 += (reactionTimeList.get(i)).reactionTime();
            }
            return avg10 / 10;
        }
    }

    //calculates the average of the last 100 reaction times
    public long avg100Value(){
        long avg100 = 0;
        //if there are less than 100 reaction times, calculates the average of what there is
        if (reactionTimeList.size() < 100) {
            for (int i = 0; i < reactionTimeList.size(); i++) {
                avg100 += (reactionTimeList.get(i)).reactionTime();
            }
            return avg100 / reactionTimeList.size();
        } else {
            //if there are at least 100 reaction times then calculates the average of the last 100
            for (int i = (reactionTimeList.size() - 10); i < reactionTimeList.size(); i++) {
                avg100 += (reactionTimeList.get(i)).reactionTime();
            }
            return avg100 / 100;
        }
    }


}
