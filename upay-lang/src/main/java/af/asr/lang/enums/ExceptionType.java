package af.asr.lang.enums;



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
