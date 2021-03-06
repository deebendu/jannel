/*
 * The MIT License (MIT)
 * Copyright (c) 2016 Spyros Papageorgiou
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to
 * deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or
 * sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.spapageo.jannel.msg;

import com.github.spapageo.jannel.msg.enums.SmsConstants;

/**
 * A heartbeat to verify the other end is still there
 */
public class HeartBeat implements Message {

    /**
     * The system load
     */
    private int load;

    /**
     * Construct a new message with the given system load
     * @param load the system load
     */
    public HeartBeat(int load) {
        this.load = load;
    }

    /**
     * Default construction
     */
    public HeartBeat() {
        this.load = SmsConstants.PARAM_UNDEFINED;
    }

    /**
     * @return the system load
     */
    public int getLoad() {
        return load;
    }

    /**
     * Sets the system load
     * @param load the system load
     */
    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public MessageType getType() {
        return MessageType.HEARTBEAT;
    }

    @Override
    public String toString() {
        return "HeartBeat{" +
               "load=" + load +
               '}';
    }
}
