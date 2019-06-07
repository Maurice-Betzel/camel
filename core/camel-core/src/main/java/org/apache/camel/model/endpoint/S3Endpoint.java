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
 * The aws-s3 component is used for storing and retrieving objecct from Amazon
 * S3 Storage Service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface S3Endpoint {


    public static class S3Common<T extends EndpointDefinition>
            extends
                EndpointDefinition<T> {
        S3Common(String path) {
            super("aws-s3", path);
        }
        /**
         * Bucket name or ARN. The option is a java.lang.String type.
         */
        public T bucketNameOrArn(String bucketNameOrArn) {
            this.properties.put("bucketNameOrArn", bucketNameOrArn);
            return (T) this;
        }
        /**
         * Reference to a com.amazonaws.services.s3.AmazonS3 in the
         * link:registry.htmlRegistry. The option is a
         * com.amazonaws.services.s3.AmazonS3 type.
         */
        public T amazonS3Client(Object amazonS3Client) {
            this.properties.put("amazonS3Client", amazonS3Client);
            return (T) this;
        }
        /**
         * Setting the autocreation of the bucket. The option is a boolean type.
         */
        public T autoCreateBucket(boolean autoCreateBucket) {
            this.properties.put("autoCreateBucket", autoCreateBucket);
            return (T) this;
        }
        /**
         * Whether or not the S3 client should use path style access. The option
         * is a boolean type.
         */
        public T pathStyleAccess(boolean pathStyleAccess) {
            this.properties.put("pathStyleAccess", pathStyleAccess);
            return (T) this;
        }
        /**
         * The policy for this queue to set in the
         * com.amazonaws.services.s3.AmazonS3#setBucketPolicy() method. The
         * option is a java.lang.String type.
         */
        public T policy(String policy) {
            this.properties.put("policy", policy);
            return (T) this;
        }
        /**
         * To define a proxy host when instantiating the SQS client. The option
         * is a java.lang.String type.
         */
        public T proxyHost(String proxyHost) {
            this.properties.put("proxyHost", proxyHost);
            return (T) this;
        }
        /**
         * Specify a proxy port to be used inside the client definition. The
         * option is a java.lang.Integer type.
         */
        public T proxyPort(Integer proxyPort) {
            this.properties.put("proxyPort", proxyPort);
            return (T) this;
        }
        /**
         * The region in which S3 client needs to work. The option is a
         * java.lang.String type.
         */
        public T region(String region) {
            this.properties.put("region", region);
            return (T) this;
        }
        /**
         * Set whether the S3 client should expect to load credentials on an EC2
         * instance or to expect static credentials to be passed in. The option
         * is a boolean type.
         */
        public T useIAMCredentials(boolean useIAMCredentials) {
            this.properties.put("useIAMCredentials", useIAMCredentials);
            return (T) this;
        }
        /**
         * The encryption materials to use in case of Symmetric/Asymmetric
         * client usage. The option is a
         * com.amazonaws.services.s3.model.EncryptionMaterials type.
         */
        public T encryptionMaterials(Object encryptionMaterials) {
            this.properties.put("encryptionMaterials", encryptionMaterials);
            return (T) this;
        }
        /**
         * Define if encryption must be used or not. The option is a boolean
         * type.
         */
        public T useEncryption(boolean useEncryption) {
            this.properties.put("useEncryption", useEncryption);
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
         * Define if Accelerate Mode enabled is true or false. The option is a
         * boolean type.
         */
        public T accelerateModeEnabled(boolean accelerateModeEnabled) {
            this.properties.put("accelerateModeEnabled", accelerateModeEnabled);
            return (T) this;
        }
        /**
         * Define if disabled Chunked Encoding is true or false. The option is a
         * boolean type.
         */
        public T chunkedEncodingDisabled(boolean chunkedEncodingDisabled) {
            this.properties.put("chunkedEncodingDisabled", chunkedEncodingDisabled);
            return (T) this;
        }
        /**
         * Define if Dualstack enabled is true or false. The option is a boolean
         * type.
         */
        public T dualstackEnabled(boolean dualstackEnabled) {
            this.properties.put("dualstackEnabled", dualstackEnabled);
            return (T) this;
        }
        /**
         * Define if Force Global Bucket Access enabled is true or false. The
         * option is a boolean type.
         */
        public T forceGlobalBucketAccessEnabled(
                boolean forceGlobalBucketAccessEnabled) {
            this.properties.put("forceGlobalBucketAccessEnabled", forceGlobalBucketAccessEnabled);
            return (T) this;
        }
        /**
         * Define if Payload Signing enabled is true or false. The option is a
         * boolean type.
         */
        public T payloadSigningEnabled(boolean payloadSigningEnabled) {
            this.properties.put("payloadSigningEnabled", payloadSigningEnabled);
            return (T) this;
        }
        /**
         * Amazon AWS Access Key. The option is a java.lang.String type.
         */
        public T accessKey(String accessKey) {
            this.properties.put("accessKey", accessKey);
            return (T) this;
        }
        /**
         * Amazon AWS Secret Key. The option is a java.lang.String type.
         */
        public T secretKey(String secretKey) {
            this.properties.put("secretKey", secretKey);
            return (T) this;
        }
    }

    public static class S3Consumer
            extends
                S3Common<S3Consumer>
            implements
                EndpointDefinition.Consumer {
        public S3Consumer(String path) {
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
        public S3Consumer bridgeErrorHandler(boolean bridgeErrorHandler) {
            this.properties.put("bridgeErrorHandler", bridgeErrorHandler);
            return (S3Consumer) this;
        }
        /**
         * Delete objects from S3 after they have been retrieved. The delete is
         * only performed if the Exchange is committed. If a rollback occurs,
         * the object is not deleted. If this option is false, then the same
         * objects will be retrieve over and over again on the polls. Therefore
         * you need to use the Idempotent Consumer EIP in the route to filter
         * out duplicates. You can filter using the S3Constants#BUCKET_NAME and
         * S3Constants#KEY headers, or only the S3Constants#KEY header. The
         * option is a boolean type.
         */
        public S3Consumer deleteAfterRead(boolean deleteAfterRead) {
            this.properties.put("deleteAfterRead", deleteAfterRead);
            return (S3Consumer) this;
        }
        /**
         * The delimiter which is used in the
         * com.amazonaws.services.s3.model.ListObjectsRequest to only consume
         * objects we are interested in. The option is a java.lang.String type.
         */
        public S3Consumer delimiter(String delimiter) {
            this.properties.put("delimiter", delimiter);
            return (S3Consumer) this;
        }
        /**
         * To get the object from the bucket with the given file name. The
         * option is a java.lang.String type.
         */
        public S3Consumer fileName(String fileName) {
            this.properties.put("fileName", fileName);
            return (S3Consumer) this;
        }
        /**
         * If it is true, the exchange body will be set to a stream to the
         * contents of the file. If false, the headers will be set with the S3
         * object metadata, but the body will be null. This option is strongly
         * related to autocloseBody option. In case of setting includeBody to
         * true and autocloseBody to false, it will be up to the caller to close
         * the S3Object stream. Setting autocloseBody to true, will close the
         * S3Object stream automatically. The option is a boolean type.
         */
        public S3Consumer includeBody(boolean includeBody) {
            this.properties.put("includeBody", includeBody);
            return (S3Consumer) this;
        }
        /**
         * Set the maxConnections parameter in the S3 client configuration. The
         * option is a int type.
         */
        public S3Consumer maxConnections(int maxConnections) {
            this.properties.put("maxConnections", maxConnections);
            return (S3Consumer) this;
        }
        /**
         * Gets the maximum number of messages as a limit to poll at each
         * polling. Is default unlimited, but use 0 or negative number to
         * disable it as unlimited. The option is a int type.
         */
        public S3Consumer maxMessagesPerPoll(int maxMessagesPerPoll) {
            this.properties.put("maxMessagesPerPoll", maxMessagesPerPoll);
            return (S3Consumer) this;
        }
        /**
         * The prefix which is used in the
         * com.amazonaws.services.s3.model.ListObjectsRequest to only consume
         * objects we are interested in. The option is a java.lang.String type.
         */
        public S3Consumer prefix(String prefix) {
            this.properties.put("prefix", prefix);
            return (S3Consumer) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead. The option is a
         * boolean type.
         */
        public S3Consumer sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            this.properties.put("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return (S3Consumer) this;
        }
        /**
         * If this option is true and includeBody is true, then the
         * S3Object.close() method will be called on exchange completion. This
         * option is strongly related to includeBody option. In case of setting
         * includeBody to true and autocloseBody to false, it will be up to the
         * caller to close the S3Object stream. Setting autocloseBody to true,
         * will close the S3Object stream automatically. The option is a boolean
         * type.
         */
        public S3Consumer autocloseBody(boolean autocloseBody) {
            this.properties.put("autocloseBody", autocloseBody);
            return (S3Consumer) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored. The option is a
         * org.apache.camel.spi.ExceptionHandler type.
         */
        public S3Consumer exceptionHandler(ExceptionHandler exceptionHandler) {
            this.properties.put("exceptionHandler", exceptionHandler);
            return (S3Consumer) this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange. The
         * option is a org.apache.camel.ExchangePattern type.
         */
        public S3Consumer exchangePattern(ExchangePattern exchangePattern) {
            this.properties.put("exchangePattern", exchangePattern);
            return (S3Consumer) this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel. The option is a
         * org.apache.camel.spi.PollingConsumerPollStrategy type.
         */
        public S3Consumer pollStrategy(PollingConsumerPollStrategy pollStrategy) {
            this.properties.put("pollStrategy", pollStrategy);
            return (S3Consumer) this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in. The option
         * is a int type.
         */
        public S3Consumer backoffErrorThreshold(int backoffErrorThreshold) {
            this.properties.put("backoffErrorThreshold", backoffErrorThreshold);
            return (S3Consumer) this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in. The option is a int type.
         */
        public S3Consumer backoffIdleThreshold(int backoffIdleThreshold) {
            this.properties.put("backoffIdleThreshold", backoffIdleThreshold);
            return (S3Consumer) this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured. The option is a int type.
         */
        public S3Consumer backoffMultiplier(int backoffMultiplier) {
            this.properties.put("backoffMultiplier", backoffMultiplier);
            return (S3Consumer) this;
        }
        /**
         * Milliseconds before the next poll. You can also specify time values
         * using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public S3Consumer delay(long delay) {
            this.properties.put("delay", delay);
            return (S3Consumer) this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages. The
         * option is a boolean type.
         */
        public S3Consumer greedy(boolean greedy) {
            this.properties.put("greedy", greedy);
            return (S3Consumer) this;
        }
        /**
         * Milliseconds before the first poll starts. You can also specify time
         * values using units, such as 60s (60 seconds), 5m30s (5 minutes and 30
         * seconds), and 1h (1 hour). The option is a long type.
         */
        public S3Consumer initialDelay(long initialDelay) {
            this.properties.put("initialDelay", initialDelay);
            return (S3Consumer) this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that. The option
         * is a org.apache.camel.LoggingLevel type.
         */
        public S3Consumer runLoggingLevel(LoggingLevel runLoggingLevel) {
            this.properties.put("runLoggingLevel", runLoggingLevel);
            return (S3Consumer) this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool. The option is a java.util.concurrent.ScheduledExecutorService
         * type.
         */
        public S3Consumer scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            this.properties.put("scheduledExecutorService", scheduledExecutorService);
            return (S3Consumer) this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz2
         * component. The option is a
         * org.apache.camel.spi.ScheduledPollConsumerScheduler type.
         */
        public S3Consumer scheduler(ScheduledPollConsumerScheduler scheduler) {
            this.properties.put("scheduler", scheduler);
            return (S3Consumer) this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz2, Spring based scheduler. The option is a
         * java.util.Map<java.lang.String,java.lang.Object> type.
         */
        public S3Consumer schedulerProperties(
                Map<String, Object> schedulerProperties) {
            this.properties.put("schedulerProperties", schedulerProperties);
            return (S3Consumer) this;
        }
        /**
         * Whether the scheduler should be auto started. The option is a boolean
         * type.
         */
        public S3Consumer startScheduler(boolean startScheduler) {
            this.properties.put("startScheduler", startScheduler);
            return (S3Consumer) this;
        }
        /**
         * Time unit for initialDelay and delay options. The option is a
         * java.util.concurrent.TimeUnit type.
         */
        public S3Consumer timeUnit(TimeUnit timeUnit) {
            this.properties.put("timeUnit", timeUnit);
            return (S3Consumer) this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details. The option is a boolean
         * type.
         */
        public S3Consumer useFixedDelay(boolean useFixedDelay) {
            this.properties.put("useFixedDelay", useFixedDelay);
            return (S3Consumer) this;
        }
    }

    public static class S3Producer
            extends
                S3Common<S3Producer>
            implements
                EndpointDefinition.Producer {
        public S3Producer(String path) {
            super(path);
        }
        /**
         * Delete file object after the S3 file has been uploaded. The option is
         * a boolean type.
         */
        public S3Producer deleteAfterWrite(boolean deleteAfterWrite) {
            this.properties.put("deleteAfterWrite", deleteAfterWrite);
            return (S3Producer) this;
        }
        /**
         * If it is true, camel will upload the file with multi part format, the
         * part size is decided by the option of partSize. The option is a
         * boolean type.
         */
        public S3Producer multiPartUpload(boolean multiPartUpload) {
            this.properties.put("multiPartUpload", multiPartUpload);
            return (S3Producer) this;
        }
        /**
         * The operation to do in case the user don't want to do only an upload.
         * The option is a org.apache.camel.component.aws.s3.S3Operations type.
         */
        public S3Producer operation(S3Operations operation) {
            this.properties.put("operation", operation);
            return (S3Producer) this;
        }
        /**
         * Setup the partSize which is used in multi part upload, the default
         * size is 25M. The option is a long type.
         */
        public S3Producer partSize(long partSize) {
            this.properties.put("partSize", partSize);
            return (S3Producer) this;
        }
        /**
         * Sets the server-side encryption algorithm when encrypting the object
         * using AWS-managed keys. For example use AES256. The option is a
         * java.lang.String type.
         */
        public S3Producer serverSideEncryption(String serverSideEncryption) {
            this.properties.put("serverSideEncryption", serverSideEncryption);
            return (S3Producer) this;
        }
        /**
         * The storage class to set in the
         * com.amazonaws.services.s3.model.PutObjectRequest request. The option
         * is a java.lang.String type.
         */
        public S3Producer storageClass(String storageClass) {
            this.properties.put("storageClass", storageClass);
            return (S3Producer) this;
        }
        /**
         * Define the id of KMS key to use in case KMS is enabled. The option is
         * a java.lang.String type.
         */
        public S3Producer awsKMSKeyId(String awsKMSKeyId) {
            this.properties.put("awsKMSKeyId", awsKMSKeyId);
            return (S3Producer) this;
        }
        /**
         * Define if KMS must be used or not. The option is a boolean type.
         */
        public S3Producer useAwsKMS(boolean useAwsKMS) {
            this.properties.put("useAwsKMS", useAwsKMS);
            return (S3Producer) this;
        }
    }

    public static enum S3Operations {
        copyObject, deleteBucket, listBuckets, downloadLink;
    }
    public default S3Consumer fromS3(String path) {
        return new S3Consumer(path);
    }
    public default S3Producer toS3(String path) {
        return new S3Producer(path);
    }
}