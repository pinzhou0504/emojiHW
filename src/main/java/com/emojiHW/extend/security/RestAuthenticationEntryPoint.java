package com.emojiHW.extend.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("restAuthenticationEntryPoint")
public final class RestAuthenticationEntryPoint  implements AuthenticationEntryPoint{

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                         AuthenticationException e) throws IOException, ServletException {
        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,"Unauthorized");
    }
}
