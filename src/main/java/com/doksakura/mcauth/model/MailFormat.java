package com.doksakura.mcauth.model;

import lombok.Data;

@Data
public class MailFormat {
    private String to;
    private String personal;
    private String header;
    private String html;
}
