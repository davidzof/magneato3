package org.magneato.resources;

import io.dropwizard.views.View;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

// http://blog.locrian.uk/post/jetty-form-auth-dropwizard/
// https://www.dropwizard.io/0.7.1/docs/manual/views.html
@Path("/login")
public class LoginResource {

    @GET
    public View login() {
        return new LoginView();
    }

    @GET @Path("error")
    public String error() {
        return "error logging in";
    }
}