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
 * The gRPC component allows to call and expose remote procedures via HTTP/2
 * with protobuf dataformat
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface GrpcEndpoint {


    public static class GrpcCommon<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        GrpcCommon(String path) {
            super("grpc", path);
        }
        /**
         * The gRPC server host name. This is localhost or 0.0.0.0 when being a
         * consumer or remote server host name when using producer. The option
         * is a java.lang.String type.
         */
        public T host(String host) {
            this.properties.put("host", host);
            return (T) this;
        }
        /**
         * The gRPC local or remote server port. The option is a int type.
         */
        public T port(int port) {
            this.properties.put("port", port);
            return (T) this;
        }
        /**
         * Fully qualified service name from the protocol buffer descriptor file
         * (package dot service definition name). The option is a
         * java.lang.String type.
         */
        public T service(String service) {
            this.properties.put("service", service);
            return (T) this;
        }
        /**
         * The HTTP/2 flow control window size (MiB). The option is a int type.
         */
        public T flowControlWindow(int flowControlWindow) {
            this.properties.put("flowControlWindow", flowControlWindow);
            return (T) this;
        }
        /**
         * The maximum message size allowed to be received/sent (MiB). The
         * option is a int type.
         */
        public T maxMessageSize(int maxMessageSize) {
            this.properties.put("maxMessageSize", maxMessageSize);
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
         * Authentication method type in advance to the SSL/TLS negotiation. The
         * option is a org.apache.camel.component.grpc.GrpcAuthType type.
         */
        public T authenticationType(GrpcAuthType authenticationType) {
            this.properties.put("authenticationType", authenticationType);
            return (T) this;
        }
        /**
         * JSON Web Token sign algorithm. The option is a
         * org.apache.camel.component.grpc.auth.jwt.JwtAlgorithm type.
         */
        public T jwtAlgorithm(JwtAlgorithm jwtAlgorithm) {
            this.properties.put("jwtAlgorithm", jwtAlgorithm);
            return (T) this;
        }
        /**
         * JSON Web Token issuer. The option is a java.lang.String type.
         */
        public T jwtIssuer(String jwtIssuer) {
            this.properties.put("jwtIssuer", jwtIssuer);
            return (T) this;
        }
        /**
         * JSON Web Token secret. The option is a java.lang.String type.
         */
        public T jwtSecret(String jwtSecret) {
            this.properties.put("jwtSecret", jwtSecret);
            return (T) this;
        }
        /**
         * JSON Web Token subject. The option is a java.lang.String type.
         */
        public T jwtSubject(String jwtSubject) {
            this.properties.put("jwtSubject", jwtSubject);
            return (T) this;
        }
        /**
         * The X.509 certificate chain file resource in PEM format link. The
         * option is a java.lang.String type.
         */
        public T keyCertChainResource(String keyCertChainResource) {
            this.properties.put("keyCertChainResource", keyCertChainResource);
            return (T) this;
        }
        /**
         * The PKCS#8 private key file password. The option is a
         * java.lang.String type.
         */
        public T keyPassword(String keyPassword) {
            this.properties.put("keyPassword", keyPassword);
            return (T) this;
        }
        /**
         * The PKCS#8 private key file resource in PEM format link. The option
         * is a java.lang.String type.
         */
        public T keyResource(String keyResource) {
            this.properties.put("keyResource", keyResource);
            return (T) this;
        }
        /**
         * Identifies the security negotiation type used for HTTP/2
         * communication. The option is a io.grpc.netty.NegotiationType type.
         */
        public T negotiationType(NegotiationType negotiationType) {
            this.properties.put("negotiationType", negotiationType);
            return (T) this;
        }
        /**
         * Service Account key file in JSON format resource link supported by
         * the Google Cloud SDK. The option is a java.lang.String type.
         */
        public T serviceAccountResource(String serviceAccountResource) {
            this.properties.put("serviceAccountResource", serviceAccountResource);
            return (T) this;
        }
        /**
         * The trusted certificates collection file resource in PEM format for
         * verifying the remote endpoint's certificate. The option is a
         * java.lang.String type.
         */
        public T trustCertCollectionResource(String trustCertCollectionResource) {
            this.properties.put("trustCertCollectionResource", trustCertCollectionResource);
            return (T) this;
        }
    }

    public static class GrpcConsumer
            extends
                GrpcCommon<GrpcConsumer>
            implements
                EndpointDefinition.Consumer {
        public GrpcConsumer(String path) {
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
        public GrpcConsumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (GrpcConsumer) this;
        }
        /**
         * This option specifies the top-level strategy for processing service
         * requests and responses in streaming mode. If an aggregation strategy
         * is selected, all requests will be accumulated in the list, then
         * transferred to the flow, and the accumulated responses will be sent
         * to the sender. If a propagation strategy is selected, request is sent
         * to the stream, and the response will be immediately sent back to the
         * sender. The option is a
         * org.apache.camel.component.grpc.GrpcConsumerStrategy type.
         */
        public GrpcConsumer consumerStrategy(
                GrpcConsumerStrategy consumerStrategy) {
            this.properties.put("consumerStrategy", consumerStrategy);
            return (GrpcConsumer) this;
        }
        /**
         * Determines if onCompleted events should be pushed to the Camel route.
         * The option is a boolean type.
         */
        public GrpcConsumer forwardOnCompleted(boolean forwardOnCompleted) {
            this.properties.put("forwardOnCompleted", forwardOnCompleted);
            return (GrpcConsumer) this;
        }
        /**
         * Determines if onError events should be pushed to the Camel route.
         * Exceptions will be set as message body. The option is a boolean type.
         */
        public GrpcConsumer forwardOnError(boolean forwardOnError) {
            this.properties.put("forwardOnError", forwardOnError);
            return (GrpcConsumer) this;
        }
        /**
         * The maximum number of concurrent calls permitted for each incoming
         * server connection. The option is a int type.
         */
        public GrpcConsumer maxConcurrentCallsPerConnection(
                int maxConcurrentCallsPerConnection) {
            this.properties.put("maxConcurrentCallsPerConnection", maxConcurrentCallsPerConnection);
            return (GrpcConsumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public GrpcConsumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (GrpcConsumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public GrpcConsumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (GrpcConsumer) this;
        }
    }

    public static class GrpcProducer
            extends
                GrpcCommon<GrpcProducer>
            implements
                EndpointDefinition.Producer {
        public GrpcProducer(String path) {
            super(path);
        }
        /**
         * gRPC method name. The option is a java.lang.String type.
         */
        public GrpcProducer method(String method) {
            this.properties.put("method", method);
            return (GrpcProducer) this;
        }
        /**
         * The mode used to communicate with a remote gRPC server. In SIMPLE
         * mode a single exchange is translated into a remote procedure call. In
         * STREAMING mode all exchanges will be sent within the same request
         * (input and output of the recipient gRPC service must be of type
         * 'stream'). The option is a
         * org.apache.camel.component.grpc.GrpcProducerStrategy type.
         */
        public GrpcProducer producerStrategy(
                GrpcProducerStrategy producerStrategy) {
            this.properties.put("producerStrategy", producerStrategy);
            return (GrpcProducer) this;
        }
        /**
         * When using STREAMING client mode, it indicates the endpoint where
         * responses should be forwarded. The option is a java.lang.String type.
         */
        public GrpcProducer streamRepliesTo(String streamRepliesTo) {
            this.properties.put("streamRepliesTo", streamRepliesTo);
            return (GrpcProducer) this;
        }
        /**
         * The user agent header passed to the server. The option is a
         * java.lang.String type.
         */
        public GrpcProducer userAgent(String userAgent) {
            this.properties.put("userAgent", userAgent);
            return (GrpcProducer) this;
        }
    }

    public static enum GrpcConsumerStrategy {
        AGGREGATION, PROPAGATION;
    }

    public static enum GrpcProducerStrategy {
        SIMPLE, STREAMING;
    }

    public static enum GrpcAuthType {
        NONE, GOOGLE, JWT;
    }

    public static enum JwtAlgorithm {
        HMAC256, HMAC384, HMAC512;
    }

    public static enum NegotiationType {
        TLS, PLAINTEXT_UPGRADE, PLAINTEXT;
    }
    public default GrpcConsumer fromGrpc(String path) {
        return new GrpcConsumer(path);
    }
    public default GrpcProducer toGrpc(String path) {
        return new GrpcProducer(path);
    }
}