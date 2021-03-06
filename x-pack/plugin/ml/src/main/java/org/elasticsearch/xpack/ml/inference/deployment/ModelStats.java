/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the Elastic License
 * 2.0; you may not use this file except in compliance with the Elastic License
 * 2.0.
 */

package org.elasticsearch.xpack.ml.inference.deployment;

import java.time.Instant;
import java.util.LongSummaryStatistics;

public record ModelStats(
    Instant startTime,
    LongSummaryStatistics timingStats,
    Instant lastUsed,
    int pendingCount,
    int errorCount,
    int rejectedExecutionCount,
    int timeoutCount,
    Integer inferenceThreads,
    Integer modelThreads
) {}
