package com.portfolio.backend.api.portfolio.exceptions;

public class SkillsNotFoundException extends Exception{
    public SkillsNotFoundException() {
    }

    public SkillsNotFoundException(String message) {
        super(message);
    }

    public SkillsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SkillsNotFoundException(Throwable cause) {
        super(cause);
    }

    public SkillsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
