/*
 * Copyright 2019 Nikolaos Grammatikos <nikosgram@oglofus.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oglofus.protection.api.sender;

import com.oglofus.protection.api.Identifiable;
import com.oglofus.protection.api.Nameable;
import com.oglofus.protection.api.Transformable;

public interface Sender extends Identifiable, Nameable, Transformable {
    default void sendMessage(String message) {
        sendMessage(MessageType.Chat, message);
    }

    void sendMessage(MessageType type, String message);
}