/*
 * Copyright (C) 2014  Camptocamp
 *
 * This file is part of MapFish Print
 *
 * MapFish Print is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MapFish Print is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with MapFish Print.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mapfish.print.config;

import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;

/**
 * A matcher that always returns true.
 *
 * Created by Jesse on 1/20/14.
 */
public class AcceptAllMatcher extends HostMatcher {
    @Override
    public boolean validate(final URI uri) throws UnknownHostException, SocketException, MalformedURLException {
        return true;
    }

    @Override
    public String toString() {
        return "Accept All";
    }

}