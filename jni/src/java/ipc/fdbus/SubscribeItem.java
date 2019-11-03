/*
 * Copyright (C) 2015   Jeremy Chen jeremy_cz@yahoo.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ipc.fdbus;

public class SubscribeItem
{
    public SubscribeItem(int code, String filter)
    {
        mCode = code;
        mTopic = filter;
    }
    public SubscribeItem(int code)
    {
        mCode = code;
        mTopic = null;
    }

    public int code()
    {
        return mCode;
    }

    public String topic()
    {
        return mTopic;
    }

    private int mCode;
    private String mTopic;
}
