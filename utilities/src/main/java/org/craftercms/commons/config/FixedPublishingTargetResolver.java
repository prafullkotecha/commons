/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.commons.config;

import java.beans.ConstructorProperties;

/**
 * Implementation of {@link PublishingTargetResolver} that always returns the configured target
 *
 * @author joseross
 * @since 3.1.6
 */
public class FixedPublishingTargetResolver implements PublishingTargetResolver {

    /**
     * The target to use
     */
    protected String target;

    @ConstructorProperties({"target"})
    public FixedPublishingTargetResolver(String target) {
        this.target = target;
    }

    @Override
    public String getPublishingTarget() {
        return target;
    }

}
