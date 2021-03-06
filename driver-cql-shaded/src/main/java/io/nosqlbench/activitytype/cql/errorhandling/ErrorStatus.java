package io.nosqlbench.activitytype.cql.errorhandling;

import io.nosqlbench.activitytype.cql.api.ErrorResponse;

public class ErrorStatus {
    private boolean retryable;
    private int resultCode;
    private ErrorResponse response;

    public ErrorStatus(ErrorResponse response, boolean retryable, int resultCode) {
        this.response = response;
        this.retryable = retryable;
        this.resultCode = resultCode;
    }

    public boolean isRetryable() {
        return retryable;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public ErrorResponse getResponse() {
        return response;
    }
}
