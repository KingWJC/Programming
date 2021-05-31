package responsibility.servlet;

public interface Filter {
    boolean doFilter(Request request, Response response, FilterChain chain);
}

class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.message = request.message.replace('<', '[').replace('>', ']');
        chain.doFilter(request, response);
        response.message += "--HTMLFilter";
        return true;
    }
}

class URLFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.message = request.message.replace("baidu.com", "https://www.baidu.com");
        chain.doFilter(request, response);
        response.message += "--URLFilter";
        return true;
    }
}

class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Request request, Response response, FilterChain chain) {
        request.message = request.message.replace(":)", "^V^");
        chain.doFilter(request, response);
        response.message += "--FaceFilter";
        return true;
    }
}
