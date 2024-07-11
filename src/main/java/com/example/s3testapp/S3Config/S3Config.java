package com.example.s3testapp.S3Config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration;

@Configuration
public class S3Config {

    private String accessKey = "DO0069DNU39VPYRNDMFE";
    private String accessSecret = "wzSlwUjXEsLKgUteCJBM3/8F99ZczErTb0lns5xIaZE";
    private String spaceRegion = "us-east-1";

    private String spaceEndpoint = "https://syd1.digitaloceanspaces.com";
    @Bean
    public AmazonS3 getS3() {
        BasicAWSCredentials creds = new BasicAWSCredentials(accessKey, accessSecret);
        return AmazonS3ClientBuilder.standard()
                .withEndpointConfiguration(new EndpointConfiguration(spaceEndpoint, spaceRegion))
                .withCredentials(new AWSStaticCredentialsProvider(creds)).build();
    }
}
