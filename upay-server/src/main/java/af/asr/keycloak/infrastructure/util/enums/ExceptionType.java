package af.asr.keycloak.infrastructure.util.enums;



public enum ExceptionType {

    NoHandlerFoundException,
    Exception,
    HttpRequestMethodNotSupportedException,
    MethodArgumentNotValidException,
    MissingServletRequestParameterException,
    ConstraintViolationException,
    HttpMessageNotReadableException,
    HttpMediaTypeNotSupportedException,
    KafkaException,
    DataRepositoryException,
    InternalResourceNotFoundException;
    private ExceptionType(){

    }
}
