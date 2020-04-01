package ml.socshared.template.api.v1.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;

import java.util.HashMap;

@Api(value = "Hello Controller")
public interface HelloApi {

    @ApiOperation(value = "print hello, world", notes = "print hello, world")
    HashMap<String, String> printHelloWorld(KeycloakAuthenticationToken token);
}
