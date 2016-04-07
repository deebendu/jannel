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

/**
 * The administration command
 */
public enum AdminCommand {

    /**
     * Shutdown request
     */
    SHUTDOWN(0),

    /**
     * Suspend operation request
     */
    SUSPEND(1),

    /**
     * Resume operation request
     */
    RESUME(2),

    /**
     * Identify request
     */
    IDENTIFY(3),

    /**
     * Restart request
     */
    RESTART(4),

    /**
     * Not defined
     */
    ADMIN_UNDEF(-1);

    private final int value;

    private static final AdminCommand[] valueMap = new AdminCommand[5];

    static {
        valueMap[SHUTDOWN.value] = SHUTDOWN;
        valueMap[SUSPEND.value] = SUSPEND;
        valueMap[RESUME.value] = RESUME;
        valueMap[IDENTIFY.value] = IDENTIFY;
        valueMap[RESTART.value] = RESTART;
    }

    AdminCommand(int value) {
        this.value = value;
    }

    public int value(){
        return value;
    }

    /**
     * Calculate the AdminCommand by its value
     * @param value the value to convert to a AdminCommand
     * @return the AdminCommand
     */
    public static AdminCommand fromValue(int value){
        return  value < 0 || value > 4 ? ADMIN_UNDEF : valueMap[value];
    }
}
