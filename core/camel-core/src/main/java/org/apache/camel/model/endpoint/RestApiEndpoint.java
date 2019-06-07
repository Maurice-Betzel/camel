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
 * The rest-api component is used for providing Swagger API of the REST services
 * which has been defined using the rest-dsl in Camel.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface RestApiEndpoint {


    public static class RestApiCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        RestApiCommon(String path) {
            super("rest-api", path);
        }
        /**
         * The base path. The option is a java.lang.String type.
         */
        public T path(String path) {
            this.properties.put("path", path);
            return (T) this;
        }
        /**
         * Optional CamelContext id pattern to only allow Rest APIs from rest
         * services within CamelContext's which name matches the pattern. The
         * option is a java.lang.String type.
         */
        public T contextIdPattern(String contextIdPattern) {
            this.properties.put("contextIdPattern", contextIdPattern);
            return (T) this;
        }
        /**
         * The Camel Rest API component to use for generating the API of the
         * REST services, such as swagger. The option is a java.lang.String
         * type.
         */
        public T apiComponentName(String apiComponentName) {
            this.properties.put("apiComponentName", apiComponentName);
            return (T) this;
        }
        /**
         * The Camel Rest component to use for the REST transport, such as
         * restlet, spark-rest. If no component has been explicit configured,
         * then Camel will lookup if there is a Camel component that integrates
         * with the Rest DSL, or if a org.apache.camel.spi.RestConsumerFactory
         * is registered in the registry. If either one is found, then that is
         * being used. The option is a java.lang.String type.
         */
        public T componentName(String componentName) {
            this.properties.put("componentName", componentName);
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

    public static class RestApiConsumer
            extends
                RestApiCommon<RestApiConsumer>
            implements
                EndpointDefinition.Consumer {
        public RestApiConsumer(String path) {
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
        public RestApiConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (RestApiConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public RestApiConsumer exceptionHandler(
                ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (RestApiConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public RestApiConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (RestApiConsumer) this;
        }
    }
    public default RestApiConsumer fromRestApi(String path) {
        return new RestApiConsumer(path);
    }
}