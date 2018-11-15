package snippet;

public class Snippet {
	spring:
	  application:
	    name: licensingservice
	  profiles:
	    active:
	      default
	  cloud:
	    config:
	      uri: http://localhost:8888
}

