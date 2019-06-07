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
 * The Thrift component allows to call and expose remote procedures (RPC) with
 * Apache Thrift data format and serialization mechanism
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ThriftEndpoint {


    public static class ThriftCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        ThriftCommon(String path) {
            super("thrift", path);
        }
        /**
         * The Thrift server host name. This is localhost or 0.0.0.0 (if not
         * defined) when being a consumer or remote server host name when using
         * producer. The option is a java.lang.String type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * The Thrift server port. The option is a int type.
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Fully qualified service name from the thrift descriptor file (package
         * dot service definition name). The option is a java.lang.String type.
         */
        public T service(String service) {
            this.properties.put("service", service);
            return (T) this;
        }
        /**
         * Protocol compression mechanism type. The option is a
         * org.apache.camel.component.thrift.ThriftCompressionType type.
         */
        public T compressionType(ThriftCompressionType compressionType) {
            this.properties.put("compressionType", compressionType);
            return (T) this;
        }
        /**
         * Exchange protocol serialization type. The option is a
         * org.apache.camel.component.thrift.ThriftExchangeProtocol type.
         */
        public T exchangeProtocol(ThriftExchangeProtocol exchangeProtocol) {
            this.properties.put("exchangeProtocol", exchangeProtocol);
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
        /**
         * Security negotiation type. The option is a
         * org.apache.camel.component.thrift.ThriftNegotiationType type.
         */
        public T negotiationType(ThriftNegotiationType negotiationType) {
            this.properties.put("negotiationType", negotiationType);
            return (T) this;
        }
        /**
         * Configuration parameters for SSL/TLS security negotiation. The option
         * is a org.apache.camel.support.jsse.SSLContextParameters type.
         */
        public T sslParameters(Object sslParameters) {
            this.properties.put("sslParameters", sslParameters);
            return (T) this;
        }
    }

    public static class ThriftConsumer
            extends
                ThriftCommon<ThriftConsumer>
            implements
                EndpointDefinition.Consumer {
        public ThriftConsumer(String path) {
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
        public ThriftConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (ThriftConsumer) this;
        }
        /**
         * Client timeout for consumers. The option is a int type.
         */
        public ThriftConsumer clientTimeout(int clientTimeout) {
            this.properties.put("clientTimeout", clientTimeout);
            return (ThriftConsumer) this;
        }
        /**
         * The Thrift server consumer max thread pool size. The option is a int
         * type.
         */
        public ThriftConsumer maxPoolSize(int maxPoolSize) {
            this.properties.put("maxPoolSize", maxPoolSize);
            return (ThriftConsumer) this;
        }
        /**
         * The Thrift server consumer initial thread pool size. The option is a
         * int type.
         */
        public ThriftConsumer poolSize(int poolSize) {
            this.properties.put("poolSize", poolSize);
            return (ThriftConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public ThriftConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (ThriftConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public ThriftConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (ThriftConsumer) this;
        }
    }

    public static class ThriftProducer
            extends
                ThriftCommon<ThriftProducer>
            implements
                EndpointDefinition.Producer {
        public ThriftProducer(String path) {
            super(path);
        }
        /**
         * The Thrift invoked method name. The option is a java.lang.String
         * type.
         */
        public ThriftProducer method(String method) {
            this.properties.put("method", method);
            return (ThriftProducer) this;
        }
    }

    public static enum ThriftCompressionType {
        NONE, ZLIB;
    }

    public static enum ThriftExchangeProtocol {
        BINARY, JSON, SJSON, COMPACT;
    }

    public static enum ThriftNegotiationType {
        PLAINTEXT, SSL, SASL;
    }
    public default ThriftConsumer fromThrift(String path) {
        return new ThriftConsumer(path);
    }
    public default ThriftProducer toThrift(String path) {
        return new ThriftProducer(path);
    }
}