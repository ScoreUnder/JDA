/*
 *     Copyright 2015-2017 Austin Keener & Michael Ritter
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

package net.dv8tion.jda.core.entities;

public interface UpdateLock
{

    /**
     * Marks this UpdateLock instance as unlocked
     * <br>This means all modifications are now allowed
     *
     * @return The old lock state
     */
    boolean unlock();

    /**
     * Marks this UpdateLock instance as locked
     * <br>This means all modifications are now prohibited
     *
     * @return The old lock state
     */
    boolean lock();

    /**
     * Whether this instance is currently under update lock
     *
     * @return True, If this instance is awaiting an update
     */
    boolean isLocked();

}
