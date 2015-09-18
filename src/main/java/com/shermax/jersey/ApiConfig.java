package com.shermax.jersey;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import javax.ws.rs.ApplicationPath;

/**
 * Created by Sherzod on 9/3/2015.
 */
@ApplicationPath("api")
public class ApiConfig extends ResourceConfig {
    public ApiConfig() {
        register(RequestContextFilter.class);
        register(MultiPartFeature.class);
        packages("com.shermax.jersey");
    }
}
