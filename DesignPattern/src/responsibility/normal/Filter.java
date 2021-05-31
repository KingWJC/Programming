package responsibility.normal;

public interface Filter {
    boolean doFilter(Msg messMsg);
}

class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Msg messMsg) {
        String message = messMsg.getMessage();
        message = message.replace('<', '[');
        message = message.replace('>', ']');
        messMsg.setMessage(message);
        return true;
    }
}

class URLFilter implements Filter {
    @Override
    public boolean doFilter(Msg messMsg) {
        String message = messMsg.getMessage();
        message = message.replace("baidu.com", "https://www.baidu.com");
        messMsg.setMessage(message);
        return true;
    }
}

class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Msg messMsg) {
        String message = messMsg.getMessage();
        message = message.replace(":)", "^V^");
        messMsg.setMessage(message);
        return true;
    }
}
