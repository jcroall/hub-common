/**
 * Hub Common
 *
 * Copyright (C) 2017 Black Duck Software, Inc.
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
package com.blackducksoftware.integration.hub.dataservice.policystatus;

import com.blackducksoftware.integration.hub.model.enumeration.PolicySeverityEnum;
import com.blackducksoftware.integration.hub.model.enumeration.VersionBomPolicyStatusOverallStatusEnum;
import com.blackducksoftware.integration.hub.model.view.VersionBomPolicyStatusView;
import com.blackducksoftware.integration.hub.model.view.components.ComponentVersionPolicyViolationCount;
import com.blackducksoftware.integration.hub.model.view.components.ComponentVersionPolicyViolationDetails;
import com.blackducksoftware.integration.hub.model.view.components.ComponentVersionStatusCount;

public class PolicyStatusDescription {
    private final VersionBomPolicyStatusView policyStatusItem;

    public PolicyStatusDescription(final VersionBomPolicyStatusView policyStatusItem) {
        this.policyStatusItem = policyStatusItem;
    }

    public String getPolicyStatusMessage() {
        if (policyStatusItem.componentVersionStatusCounts == null || policyStatusItem.componentVersionStatusCounts.size() == 0) {
            return "The Hub found no components.";
        }

        final ComponentVersionStatusCount inViolation = getCountInViolation();
        final ComponentVersionStatusCount inViolationOverridden = getCountInViolationOverridden();
        final ComponentVersionStatusCount notInViolation = getCountNotInViolation();

        final int inViolationCount = inViolation == null ? 0 : inViolation.value;
        final int inViolationOverriddenCount = inViolationOverridden == null ? 0 : inViolationOverridden.value;
        final int notInViolationCount = notInViolation == null ? 0 : notInViolation.value;

        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The Hub found: ");
        stringBuilder.append(inViolationCount);
        stringBuilder.append(" components in violation, ");
        stringBuilder.append(inViolationOverriddenCount);
        stringBuilder.append(" components in violation, but overridden, and ");
        stringBuilder.append(notInViolationCount);
        stringBuilder.append(" components not in violation.");
        return stringBuilder.toString();
    }

    @Deprecated
    public ComponentVersionStatusCount getCountInViolation() {
        if (policyStatusItem.componentVersionStatusCounts == null || policyStatusItem.componentVersionStatusCounts.isEmpty()) {
            return null;
        }
        for (final ComponentVersionStatusCount count : policyStatusItem.componentVersionStatusCounts) {
            if (VersionBomPolicyStatusOverallStatusEnum.IN_VIOLATION == count.name) {
                return count;
            }
        }
        return null;
    }

    @Deprecated
    public ComponentVersionStatusCount getCountNotInViolation() {
        if (policyStatusItem.componentVersionStatusCounts == null || policyStatusItem.componentVersionStatusCounts.isEmpty()) {
            return null;
        }
        for (final ComponentVersionStatusCount count : policyStatusItem.componentVersionStatusCounts) {
            if (VersionBomPolicyStatusOverallStatusEnum.NOT_IN_VIOLATION == count.name) {
                return count;
            }
        }
        return null;
    }

    @Deprecated
    public ComponentVersionStatusCount getCountInViolationOverridden() {
        if (policyStatusItem.componentVersionStatusCounts == null || policyStatusItem.componentVersionStatusCounts.isEmpty()) {
            return null;
        }
        for (final ComponentVersionStatusCount count : policyStatusItem.componentVersionStatusCounts) {
            if (VersionBomPolicyStatusOverallStatusEnum.IN_VIOLATION_OVERRIDDEN == count.name) {
                return count;
            }
        }
        return null;
    }

    public ComponentVersionStatusCount getCountOfPolicyStatus(final VersionBomPolicyStatusOverallStatusEnum overallStatus) {
        if (policyStatusItem.componentVersionStatusCounts == null || policyStatusItem.componentVersionStatusCounts.isEmpty()) {
            return null;
        }
        for (final ComponentVersionStatusCount count : policyStatusItem.componentVersionStatusCounts) {
            if (overallStatus == count.name) {
                return count;
            }
        }
        return null;
    }

    public ComponentVersionPolicyViolationCount getCountOfSeverity(final PolicySeverityEnum policySeverity) {
        if (policyStatusItem.componentVersionPolicyViolationDetails == null || !VersionBomPolicyStatusOverallStatusEnum.IN_VIOLATION.equals(policyStatusItem.overallStatus)) {
            return null;
        }

        final ComponentVersionPolicyViolationDetails policyViolationDetails = policyStatusItem.componentVersionPolicyViolationDetails;
        if (policyViolationDetails.severityLevels != null || !policyViolationDetails.severityLevels.isEmpty()) {
            for (final ComponentVersionPolicyViolationCount count : policyViolationDetails.severityLevels) {
                if (policySeverity == count.name) {
                    return count;
                }
            }
        }

        return null;
    }

}
