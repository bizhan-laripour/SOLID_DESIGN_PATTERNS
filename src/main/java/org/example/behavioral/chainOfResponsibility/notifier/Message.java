package org.example.behavioral.chainOfResponsibility.notifier;

public class Message {

    private String message;

    private String code;


    private Message(String message, String code) {
        this.message = message;
        this.code = code;

    }

    public static class Builder {
        private String message;

        private String code;

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setCode(String code) {
            this.code = code;
            return this;
        }


        public Message build() {
            return new Message(message, code);
        }
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

}
