package Debug;

public class TriangleExceptionThrow extends Exception {
    String message;
    public TriangleExceptionThrow(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
