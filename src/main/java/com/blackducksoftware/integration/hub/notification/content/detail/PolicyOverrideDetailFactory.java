/**
 * hub-common
 *
 * Copyright (C) 2018 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.blackducksoftware.integration.hub.notification.content.detail;

import java.util.ArrayList;
import java.util.List;

import com.blackducksoftware.integration.hub.notification.content.NotificationContent;
import com.blackducksoftware.integration.hub.notification.content.PolicyOverrideNotificationContent;

public class PolicyOverrideDetailFactory extends NotificationDetailFactory {

    @Override
    public List<NotificationContentDetail> createDetails(final NotificationContent notificationContent) {
        final PolicyOverrideNotificationContent content = (PolicyOverrideNotificationContent) notificationContent;
        final List<NotificationContentDetail> details = new ArrayList<>();
        content.policyInfos.forEach(policyInfo -> {

            String componentValue;
            if (content.componentVersion != null) {
                componentValue = null;
            } else {
                componentValue = content.component;
            }

            details.add(NotificationContentDetail.createDetail(content, NotificationContentDetail.CONTENT_KEY_GROUP_POLICY, content.projectName, content.projectVersionName, content.projectVersion, content.componentName,
                    componentValue, content.componentVersionName, content.componentVersion, policyInfo.policyName,
                    policyInfo.policy, null, null, null));
        });
        return details;
    }
}