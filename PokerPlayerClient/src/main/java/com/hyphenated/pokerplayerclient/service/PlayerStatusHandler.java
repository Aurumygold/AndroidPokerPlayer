/*
The MIT License (MIT)

Copyright (c) 2013 Jacob Kanipe-Illig

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */
package com.hyphenated.pokerplayerclient.service;

import com.hyphenated.pokerplayerclient.domain.PlayerStatus;

/**
 * Interface that describes the class that will handle updates to the player's status as
 * the game progresses.  This will likely be an activity (or closely coupled with one)
 * <br /><br />
 * Created by jacobhyphenated on 6/5/13.
 */
public interface PlayerStatusHandler {

    /**
     * Take a player status ({@link PlayerStatus}) and handle the game state updates
     * @param playerStatus Updated Player Status
     */
    public void updatePlayerStatus(PlayerStatus playerStatus);

    /**
     * After the player attempts to perform an action (fold, check, bet, call)
     * the server response will tell whether or not the action was successful
     * @param success true if the action was successful, false otherwise
     */
    public void actionResponse(boolean success);
}
