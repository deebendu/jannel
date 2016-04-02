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

package com.github.spapageo.jannel.channel;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MessageLoggerTest {

    @Test
    public void testChannelReadCallsSuperClass() throws Exception {
        MessageLogger messageLogger = new MessageLogger();
        ChannelHandlerContext channelHandlerContext = mock(ChannelHandlerContext.class);

        messageLogger.channelRead(channelHandlerContext, "test");

        verify(channelHandlerContext).fireChannelRead("test");
    }

    @Test
    public void testWriteCallsSuperClass() throws Exception {
        MessageLogger messageLogger = new MessageLogger();
        ChannelHandlerContext channelHandlerContext = mock(ChannelHandlerContext.class);
        ChannelPromise channelPromise = mock(ChannelPromise.class);

        messageLogger.write(channelHandlerContext, "test", channelPromise);

        verify(channelHandlerContext).write("test", channelPromise);
    }
}