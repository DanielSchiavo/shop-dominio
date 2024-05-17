package br.com.danielschiavo.shop.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.HandlerMapping;

import jakarta.servlet.http.HttpServletRequest;


public record MensagemErroDTO(LocalDateTime timestamp, 
							  Integer status, 
							  String erro, 
							  String mensagem, 
							  String path) {
	
    public MensagemErroDTO(HttpStatus status, RuntimeException e, HttpServletRequest request) {
        this(LocalDateTime.now(), 
        	 status.value(), 
        	 status.getReasonPhrase(), 
        	 e.getMessage(), 
        	 request.getContextPath() + request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE).toString() 
        	);
    }

	public MensagemErroDTO(HttpStatus status, String mensagem, HttpServletRequest request) {
		this(LocalDateTime.now(),
			 status.value(),
			 status.getReasonPhrase(),
			 mensagem,
			 request.getContextPath() + request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE).toString());
	}
}