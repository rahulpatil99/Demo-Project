package com.example.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="db")
public class DBConfig{
    
    private String connect;
    private int port;
    private String host;

    // Getter for dbConnection
    public String getConnect() {
        return connect;
    }

    // Setter for dbConnection
    public void setConnect(String connect) {
        this.connect = connect;
    }

    // Getter for port
    public int getPort() {
        return port;
    }

    // Setter for port
    public void setPort(int port) {
        this.port = port;
    }

    // Getter for host
    public String getHost() {
        return host;
    }

    // Setter for host
    public void setHost(String host) {
        this.host = host;
    }

}