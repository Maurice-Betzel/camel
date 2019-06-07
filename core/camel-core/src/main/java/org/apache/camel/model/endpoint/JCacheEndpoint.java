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

import java.util.List;
import java.util.Properties;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The jcache component enables you to perform caching operations using
 * JSR107/JCache as cache implementation.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface JCacheEndpoint {


    public static class JCacheCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        JCacheCommon(String path) {
            super("jcache", path);
        }
        /**
         * The name of the cache. The option is a java.lang.String type.
         */
        public T cacheName(String cacheName) {
            this.properties.put("cacheName", cacheName);
            return (T) this;
        }
        /**
         * A Configuration for the Cache. The option is a
         * javax.cache.configuration.Configuration type.
         */
        public T cacheConfiguration(Object cacheConfiguration) {
            this.properties.put("cacheConfiguration", cacheConfiguration);
            return (T) this;
        }
        /**
         * The Properties for the javax.cache.spi.CachingProvider to create the
         * CacheManager. The option is a java.util.Properties type.
         */
        public T cacheConfigurationProperties(
                Properties cacheConfigurationProperties) {
            this.properties.put("cacheConfigurationProperties", cacheConfigurationProperties);
            return (T) this;
        }
        /**
         * The fully qualified class name of the
         * javax.cache.spi.CachingProvider. The option is a java.lang.String
         * type.
         */
        public T cachingProvider(String cachingProvider) {
            this.properties.put("cachingProvider", cachingProvider);
            return (T) this;
        }
        /**
         * An implementation specific URI for the CacheManager. The option is a
         * java.lang.String type.
         */
        public T configurationUri(String configurationUri) {
            this.properties.put("configurationUri", configurationUri);
            return (T) this;
        }
        /**
         * Whether management gathering is enabled. The option is a boolean
         * type.
         */
        public T managementEnabled(boolean managementEnabled) {
            this.properties.put("managementEnabled", managementEnabled);
            return (T) this;
        }
        /**
         * If read-through caching should be used. The option is a boolean type.
         */
        public T readThrough(boolean readThrough) {
            this.properties.put("readThrough", readThrough);
            return (T) this;
        }
        /**
         * Whether statistics gathering is enabled. The option is a boolean
         * type.
         */
        public T statisticsEnabled(boolean statisticsEnabled) {
            this.properties.put("statisticsEnabled", statisticsEnabled);
            return (T) this;
        }
        /**
         * If cache should use store-by-value or store-by-reference semantics.
         * The option is a boolean type.
         */
        public T storeByValue(boolean storeByValue) {
            this.properties.put("storeByValue", storeByValue);
            return (T) this;
        }
        /**
         * If write-through caching should be used. The option is a boolean
         * type.
         */
        public T writeThrough(boolean writeThrough) {
            this.properties.put("writeThrough", writeThrough);
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
         * The CacheLoader factory. The option is a
         * javax.cache.configuration.Factory<javax.cache.integration.CacheLoader> type.
         */
        public T cacheLoaderFactory(Object cacheLoaderFactory) {
            this.properties.put("cacheLoaderFactory", cacheLoaderFactory);
            return (T) this;
        }
        /**
         * The CacheWriter factory. The option is a
         * javax.cache.configuration.Factory<javax.cache.integration.CacheWriter> type.
         */
        public T cacheWriterFactory(Object cacheWriterFactory) {
            this.properties.put("cacheWriterFactory", cacheWriterFactory);
            return (T) this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured. The option is a boolean type.
         */
        public T createCacheIfNotExists(boolean createCacheIfNotExists) {
            this.properties.put("createCacheIfNotExists", createCacheIfNotExists);
            return (T) this;
        }
        /**
         * The ExpiryPolicy factory. The option is a
         * javax.cache.configuration.Factory<javax.cache.expiry.ExpiryPolicy>
         * type.
         */
        public T expiryPolicyFactory(Object expiryPolicyFactory) {
            this.properties.put("expiryPolicyFactory", expiryPolicyFactory);
            return (T) this;
        }
        /**
         * Configure if a camel-cache should try to find implementations of
         * jcache api in runtimes like OSGi. The option is a boolean type.
         */
        public T lookupProviders(boolean lookupProviders) {
            this.properties.put("lookupProviders", lookupProviders);
            return (T) this;
        }
    }

    public static class JCacheConsumer
            extends
                JCacheCommon<JCacheConsumer>
            implements
                EndpointDefinition.Consumer {
        public JCacheConsumer(String path) {
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
        public JCacheConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (JCacheConsumer) this;
        }
        /**
         * Events a consumer should filter. If using filteredEvents option, then
         * eventFilters one will be ignored. The option is a
         * java.util.List<javax.cache.event.EventType> type.
         */
        public JCacheConsumer filteredEvents(List<EventType> filteredEvents) {
            this.properties.put("filteredEvents", filteredEvents);
            return (JCacheConsumer) this;
        }
        /**
         * if the old value is required for events. The option is a boolean
         * type.
         */
        public JCacheConsumer oldValueRequired(boolean oldValueRequired) {
            this.properties.put("oldValueRequired", oldValueRequired);
            return (JCacheConsumer) this;
        }
        /**
         * if the event listener should block the thread causing the event. The
         * option is a boolean type.
         */
        public JCacheConsumer synchronous(boolean synchronous) {
            this.properties.put("synchronous", synchronous);
            return (JCacheConsumer) this;
        }
        /**
         * The CacheEntryEventFilter. If using eventFilters option, then
         * filteredEvents one will be ignored. The option is a
         * java.util.List<javax.cache.event.CacheEntryEventFilter> type.
         */
        public JCacheConsumer eventFilters(List<Object> eventFilters) {
            this.properties.put("eventFilters", eventFilters);
            return (JCacheConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public JCacheConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (JCacheConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public JCacheConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (JCacheConsumer) this;
        }
    }

    public static class JCacheProducer
            extends
                JCacheCommon<JCacheProducer>
            implements
                EndpointDefinition.Producer {
        public JCacheProducer(String path) {
            super(path);
        }
        /**
         * To configure using a cache operation by default. If an operation in
         * the message header, then the operation from the header takes
         * precedence. The option is a java.lang.String type.
         */
        public JCacheProducer action(String action) {
            this.properties.put("action", action);
            return (JCacheProducer) this;
        }
    }

    public static enum EventType {
        CREATED, UPDATED, REMOVED, EXPIRED;
    }
    public default JCacheConsumer fromJCache(String path) {
        return new JCacheConsumer(path);
    }
    public default JCacheProducer toJCache(String path) {
        return new JCacheProducer(path);
    }
}