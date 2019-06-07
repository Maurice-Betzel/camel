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
import java.util.Map;
import java.util.Properties;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The atomix-set component is used to access Atomix's distributed set.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtomixSetEndpoint {


    public static class AtomixSetCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        AtomixSetCommon(String path) {
            super("atomix-set", path);
        }
        /**
         * The distributed resource name. The option is a java.lang.String type.
         */
        public T resourceName(String resourceName) {
            this.properties.put("resourceName", resourceName);
            return (T) this;
        }
        /**
         * The Atomix instance to use. The option is a io.atomix.Atomix type.
         */
        public T atomix(Object atomix) {
            this.properties.put("atomix", atomix);
            return (T) this;
        }
        /**
         * The Atomix configuration uri. The option is a java.lang.String type.
         */
        public T configurationUri(String configurationUri) {
            this.properties.put("configurationUri", configurationUri);
            return (T) this;
        }
        /**
         * The default action. The option is a
         * org.apache.camel.component.atomix.client.set.AtomixSet.Action type.
         */
        public T defaultAction(Object defaultAction) {
            this.properties.put("defaultAction", defaultAction);
            return (T) this;
        }
        /**
         * The address of the nodes composing the cluster. The option is a
         * java.lang.String type.
         */
        public T nodes(List<Object> nodes) {
            this.properties.put("nodes", nodes);
            return (T) this;
        }
        /**
         * The header that wil carry the result. The option is a
         * java.lang.String type.
         */
        public T resultHeader(String resultHeader) {
            this.properties.put("resultHeader", resultHeader);
            return (T) this;
        }
        /**
         * Sets the Atomix transport. The option is a
         * io.atomix.catalyst.transport.Transport type.
         */
        public T transport(Class<Object> transport) {
            this.properties.put("transport", transport);
            return (T) this;
        }
        /**
         * The resource ttl. The option is a long type.
         */
        public T ttl(long ttl) {
            this.properties.put("ttl", ttl);
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
         * The cluster wide default resource configuration. The option is a
         * java.util.Properties type.
         */
        public T defaultResourceConfig(Properties defaultResourceConfig) {
            this.properties.put("defaultResourceConfig", defaultResourceConfig);
            return (T) this;
        }
        /**
         * The local default resource options. The option is a
         * java.util.Properties type.
         */
        public T defaultResourceOptions(Properties defaultResourceOptions) {
            this.properties.put("defaultResourceOptions", defaultResourceOptions);
            return (T) this;
        }
        /**
         * Sets if the local member should join groups as PersistentMember or
         * not. If set to ephemeral the local member will receive an auto
         * generated ID thus the local one is ignored. The option is a boolean
         * type.
         */
        public T ephemeral(boolean ephemeral) {
            this.properties.put("ephemeral", ephemeral);
            return (T) this;
        }
        /**
         * The read consistency level. The option is a
         * io.atomix.resource.ReadConsistency type.
         */
        public T readConsistency(ReadConsistency readConsistency) {
            this.properties.put("readConsistency", readConsistency);
            return (T) this;
        }
        /**
         * Cluster wide resources configuration. The option is a
         * java.util.Map<java.lang.String,java.util.Properties> type.
         */
        public T resourceConfigs(Map<String, Properties> resourceConfigs) {
            this.properties.put("resourceConfigs", resourceConfigs);
            return (T) this;
        }
        /**
         * Local resources configurations. The option is a
         * java.util.Map<java.lang.String,java.util.Properties> type.
         */
        public T resourceOptions(Map<String, Properties> resourceOptions) {
            this.properties.put("resourceOptions", resourceOptions);
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

    public static class AtomixSetConsumer
            extends
                AtomixSetCommon<AtomixSetConsumer>
            implements
                EndpointDefinition.Consumer {
        public AtomixSetConsumer(String path) {
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
        public AtomixSetConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (AtomixSetConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public AtomixSetConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (AtomixSetConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public AtomixSetConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (AtomixSetConsumer) this;
        }
    }

    public static class AtomixSetProducer
            extends
                AtomixSetCommon<AtomixSetProducer>
            implements
                EndpointDefinition.Producer {
        public AtomixSetProducer(String path) {
            super(path);
        }
    }

    public static enum ReadConsistency {
        ATOMIC, ATOMIC_LEASE, SEQUENTIAL, LOCAL;
    }
    public default AtomixSetConsumer fromAtomixSet(String path) {
        return new AtomixSetConsumer(path);
    }
    public default AtomixSetProducer toAtomixSet(String path) {
        return new AtomixSetProducer(path);
    }
}