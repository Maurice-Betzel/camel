/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.endpoint;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.LoggingLevel;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;
import org.apache.camel.spi.PollingConsumerPollStrategy;
import org.apache.camel.spi.ScheduledPollConsumerScheduler;

/**
 * The atom component is used for consuming Atom RSS feeds.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtomEndpoint {


    public static class AtomCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        AtomCommon(String path) {
            super("atom", path);
        }
        /**
         * The URI to the feed to poll. The option is a java.lang.String type.
         */
        public T feedUri(String feedUri) {
            this.properties.put("feedUri", feedUri);
            return (T) this;
        }
        /**
         * Sets whether to add the feed object as a header. The option is a
         * boolean type.
         */
        public T feedHeader(boolean feedHeader) {
            this.properties.put("feedHeader", feedHeader);
            return (T) this;
        }
        /**
         * Sets whether to use filtering or not of the entries. The option is a
         * boolean type.
         */
        public T filter(boolean filter) {
            this.properties.put("filter", filter);
            return (T) this;
        }
        /**
         * Sets the timestamp to be used for filtering entries from the atom
         * feeds. This options is only in conjunction with the splitEntries. The
         * option is a java.util.Date type.
         */
        public T lastUpdate(Date lastUpdate) {
            this.properties.put("lastUpdate", lastUpdate);
            return (T) this;
        }
        /**
         * Sets the password to be used for basic authentication when polling
         * from a HTTP feed. The option is a java.lang.String type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Sets whether to sort entries by published date. Only works when
         * splitEntries = true. The option is a boolean type.
         */
        public T sortEntries(boolean sortEntries) {
            this.properties.put("sortEntries", sortEntries);
            return (T) this;
        }
        /**
         * Sets whether or not entries should be sent individually or whether
         * the entire feed should be sent as a single message. The option is a
         * boolean type.
         */
        public T splitEntries(boolean splitEntries) {
            this.properties.put("splitEntries", splitEntries);
            return (T) this;
        }
        /**
         * Sets whether all entries identified in a single feed poll should be
         * delivered immediately. If true, only one entry is processed per
         * consumer.delay. Only applicable when splitEntries = true. The option
         * is a boolean type.
         */
        public T throttleEntries(boolean throttleEntries) {
            this.properties.put("throttleEntries", throttleEntries);
            return (T) this;
        }
        /**
         * Sets the username to be used for basic authentication when polling
         * from a HTTP feed. The option is a java.lang.String type.
         */
        public T username(String username) {
            this.properties.put("username", username);
            return (T) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities. The option
         * is a boolean type.
         */
        public T basicPropertyBinding(boolean basicPropertyBinding) {
            this.properties.put("basicPropertyBinding", basicPropertyBinding);
            return (T) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported). The option
         * is a boolean type.
         */
        public T synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (T) this;
        }
    }

    public static class AtomConsumer
            extends
                AtomCommon<AtomConsumer>
            implements
                EndpointDefinition.Consumer {
        public AtomConsumer(String path) {
            super(path);
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored. The option is a boolean type.
         */
        public AtomConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (AtomConsumer) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        public AtomConsumer sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (AtomConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public AtomConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (AtomConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public AtomConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (AtomConsumer) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public AtomConsumer pollStrategy(
                PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (AtomConsumer) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        public AtomConsumer backoffErrorThreshold(int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (AtomConsumer) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        public AtomConsumer backoffIdleThreshold(int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (AtomConsumer) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        public AtomConsumer backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (AtomConsumer) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public AtomConsumer delay(long delay) {
            this.properties.put("delay", delay);
            return (AtomConsumer) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        public AtomConsumer greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (AtomConsumer) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public AtomConsumer initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (AtomConsumer) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        public AtomConsumer runLoggingLevel(LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (AtomConsumer) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        public AtomConsumer scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (AtomConsumer) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public AtomConsumer scheduler(ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (AtomConsumer) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public AtomConsumer schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (AtomConsumer) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        public AtomConsumer startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (AtomConsumer) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        public AtomConsumer timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (AtomConsumer) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        public AtomConsumer useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (AtomConsumer) this;
        }
    }
    public default AtomConsumer fromAtom(String path) {
        return new AtomConsumer(path);
    }
}