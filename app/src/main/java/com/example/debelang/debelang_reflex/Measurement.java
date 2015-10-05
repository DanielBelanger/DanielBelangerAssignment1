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

/**
 * Created by debelang on 10/4/15.
 */
public class Measurement {
    //initialize start and end times
    private long startTime;
    private long endTime;

    //sets start time as current time in milliseconds
    public void startTiming(){
        this.startTime = System.currentTimeMillis();
    }

    //sets end time as current time in milliseconds
    public void stopTiming(){
        this.endTime = System.currentTimeMillis();
    }

    //calculates the reaction time based on start and end times and returns it
    public long reactionTime(){
        return (this.startTime - this.endTime);

    }

}
