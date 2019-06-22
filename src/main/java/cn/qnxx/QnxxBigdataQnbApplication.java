package cn.qnxx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class QnxxBigdataQnbApplication {

	public static void main(String[] args) {
		SpringApplication.run(QnxxBigdataQnbApplication.class, args);
	}

}
