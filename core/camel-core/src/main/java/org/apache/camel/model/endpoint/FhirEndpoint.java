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
 * The fhir component is used for working with the FHIR protocol (health care).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FhirEndpoint {


    public static class FhirCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        FhirCommon(String path) {
            super("fhir", path);
        }
        /**
         * What kind of operation to perform. The option is a
         * org.apache.camel.component.fhir.internal.FhirApiName type.
         */
        public T apiName(FhirApiName apiName) {
            this.properties.put("apiName", apiName);
            return (T) this;
        }
        /**
         * What sub operation to use for the selected operation. The option is a
         * java.lang.String type.
         */
        public T methodName(String methodName) {
            this.properties.put("methodName", methodName);
            return (T) this;
        }
        /**
         * Encoding to use for all request. The option is a java.lang.String
         * type.
         */
        public T encoding(EncodingEnum encoding) {
            this.properties.put("encoding", encoding);
            return (T) this;
        }
        /**
         * The FHIR Version to use. The option is a java.lang.String type.
         */
        public T fhirVersion(FhirVersionEnum fhirVersion) {
            this.properties.put("fhirVersion", fhirVersion);
            return (T) this;
        }
        /**
         * Sets the name of a parameter to be passed in the exchange In Body.
         * The option is a java.lang.String type.
         */
        public T inBody(String inBody) {
            this.properties.put("inBody", inBody);
            return (T) this;
        }
        /**
         * Will log every requests and responses. The option is a boolean type.
         */
        public T log(boolean log) {
            this.properties.put("log", log);
            return (T) this;
        }
        /**
         * Pretty print all request. The option is a boolean type.
         */
        public T prettyPrint(boolean prettyPrint) {
            this.properties.put("prettyPrint", prettyPrint);
            return (T) this;
        }
        /**
         * The FHIR server base URL. The option is a java.lang.String type.
         */
        public T serverUrl(String serverUrl) {
            this.properties.put("serverUrl", serverUrl);
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
         * Compresses outgoing (POST/PUT) contents to the GZIP format. The
         * option is a boolean type.
         */
        public T compress(boolean compress) {
            this.properties.put("compress", compress);
            return (T) this;
        }
        /**
         * How long to try and establish the initial TCP connection (in ms). The
         * option is a java.lang.Integer type.
         */
        public T connectionTimeout(Integer connectionTimeout) {
            this.properties.put("connectionTimeout", connectionTimeout);
            return (T) this;
        }
        /**
         * When this option is set, model classes will not be scanned for
         * children until the child list for the given type is actually
         * accessed. The option is a boolean type.
         */
        public T deferModelScanning(boolean deferModelScanning) {
            this.properties.put("deferModelScanning", deferModelScanning);
            return (T) this;
        }
        /**
         * FhirContext is an expensive object to create. To avoid creating
         * multiple instances, it can be set directly. The option is a
         * ca.uhn.fhir.context.FhirContext type.
         */
        public T fhirContext(Object fhirContext) {
            this.properties.put("fhirContext", fhirContext);
            return (T) this;
        }
        /**
         * Force conformance check. The option is a boolean type.
         */
        public T forceConformanceCheck(boolean forceConformanceCheck) {
            this.properties.put("forceConformanceCheck", forceConformanceCheck);
            return (T) this;
        }
        /**
         * HTTP session cookie to add to every request. The option is a
         * java.lang.String type.
         */
        public T sessionCookie(String sessionCookie) {
            this.properties.put("sessionCookie", sessionCookie);
            return (T) this;
        }
        /**
         * How long to block for individual read/write operations (in ms). The
         * option is a java.lang.Integer type.
         */
        public T socketTimeout(Integer socketTimeout) {
            this.properties.put("socketTimeout", socketTimeout);
            return (T) this;
        }
        /**
         * Request that the server modify the response using the _summary param.
         * The option is a java.lang.String type.
         */
        public T summary(SummaryEnum summary) {
            this.properties.put("summary", summary);
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
         * When should Camel validate the FHIR Server's conformance statement.
         * The option is a java.lang.String type.
         */
        public T validationMode(ServerValidationModeEnum validationMode) {
            this.properties.put("validationMode", validationMode);
            return (T) this;
        }
        /**
         * The proxy host. The option is a java.lang.String type.
         */
        public T proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (T) this;
        }
        /**
         * The proxy password. The option is a java.lang.String type.
         */
        public T proxyPassword(String proxyPassword) {
            this.properties.put("proxyPassword", proxyPassword);
            return (T) this;
        }
        /**
         * The proxy port. The option is a java.lang.Integer type.
         */
        public T proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * The proxy username. The option is a java.lang.String type.
         */
        public T proxyUser(String proxyUser) {
            this.properties.put("proxyUser", proxyUser);
            return (T) this;
        }
        /**
         * OAuth access token. The option is a java.lang.String type.
         */
        public T accessToken(String accessToken) {
            this.properties.put("accessToken", accessToken);
            return (T) this;
        }
        /**
         * Username to use for basic authentication. The option is a
         * java.lang.String type.
         */
        public T password(String password) {
            this.properties.put("password", password);
            return (T) this;
        }
        /**
         * Username to use for basic authentication. The option is a
         * java.lang.String type.
         */
        public T username(String username) {
            this.properties.put("username", username);
            return (T) this;
        }
    }

    public static class FhirConsumer
            extends
                FhirCommon<FhirConsumer>
            implements
                EndpointDefinition.Consumer {
        public FhirConsumer(String path) {
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
        public FhirConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (FhirConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public FhirConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (FhirConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public FhirConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (FhirConsumer) this;
        }
    }

    public static class FhirProducer
            extends
                FhirCommon<FhirProducer>
            implements
                EndpointDefinition.Producer {
        public FhirProducer(String path) {
            super(path);
        }
    }

    public static enum FhirApiName {
        CAPABILITIES, CREATE, DELETE, HISTORY, LOAD_PAGE, META, OPERATION, PATCH, READ, SEARCH, TRANSACTION, UPDATE, VALIDATE;
    }

    public static enum EncodingEnum {
        JSON,  XML;
    }

    public static enum FhirVersionEnum {
        DSTU2,  DSTU2_HL7ORG,  DSTU2_1,  DSTU3,  R4;
    }

    public static enum SummaryEnum {
        TRUE,  FALSE,  TEXT,  DATA,  COUNT;
    }

    public static enum ServerValidationModeEnum {
        NEVER,  ONCE;
    }
    public default FhirConsumer fromFhir(String path) {
        return new FhirConsumer(path);
    }
    public default FhirProducer toFhir(String path) {
        return new FhirProducer(path);
    }
}