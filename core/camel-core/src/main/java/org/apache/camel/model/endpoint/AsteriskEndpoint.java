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

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.model.EndpointDefinition;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The asterisk component is used to interact with Asterisk PBX Server.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AsteriskEndpoint {


    public static class AsteriskCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        AsteriskCommon(String path) {
            super("asterisk", path);
        }
        /**
         * Logical name. The option is a java.lang.String type.
         */
        public T name(String name) {
            this.properties.put("name", name);
            return (T) this;
        }
        /**
         * The hostname of the asterisk server. The option is a java.lang.String
         * type.
         */
        public T hostname(String hostname) {
            this.properties.put("hostname", hostname);
            return (T) this;
        }
        /**
         * Login password. The option is a java.lang.String type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Login username. The option is a java.lang.String type.
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

    public static class AsteriskConsumer
            extends
                AsteriskCommon<AsteriskConsumer>
            implements
                EndpointDefinition.Consumer {
        public AsteriskConsumer(String path) {
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
        public AsteriskConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (AsteriskConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public AsteriskConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (AsteriskConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public AsteriskConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (AsteriskConsumer) this;
        }
    }

    public static class AsteriskProducer
            extends
                AsteriskCommon<AsteriskProducer>
            implements
                EndpointDefinition.Producer {
        public AsteriskProducer(String path) {
            super(path);
        }
        /**
         * What action to perform such as getting queue status, sip peers or
         * extension state. The option is a
         * org.apache.camel.component.asterisk.AsteriskAction type.
         */
        public AsteriskProducer action(AsteriskAction action) {
            this.properties.put("action", action);
            return (AsteriskProducer) this;
        }
    }

    public static enum AsteriskAction {
        QUEUE_STATUS, SIP_PEERS, EXTENSION_STATE;
    }
    public default AsteriskConsumer fromAsterisk(String path) {
        return new AsteriskConsumer(path);
    }
    public default AsteriskProducer toAsterisk(String path) {
        return new AsteriskProducer(path);
    }
}