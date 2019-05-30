package com.recurly.v3;

import com.recurly.v3.resources.Error;
import com.recurly.v3.RecurlyException;

public class ApiException extends RecurlyException {

    public Error error;

    public ApiException(String message, Error e) {
        super(message);
        this.error = e;
    }

    public Error getError() {
        return this.error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
