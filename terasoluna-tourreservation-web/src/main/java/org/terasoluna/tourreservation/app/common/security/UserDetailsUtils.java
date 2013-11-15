/*
 * Copyright (C) 2013 terasoluna.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.terasoluna.tourreservation.app.common.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.terasoluna.tourreservation.domain.service.userdetails.ReservationUserDetails;

public class UserDetailsUtils {
    public static ReservationUserDetails getUserDetails() {
        Authentication auth = SecurityContextHolder.getContext()
                .getAuthentication();

        if (auth != null
                && auth.getPrincipal() instanceof ReservationUserDetails) {
            return ((ReservationUserDetails) auth.getPrincipal());
        }

        return null;
    }
}
