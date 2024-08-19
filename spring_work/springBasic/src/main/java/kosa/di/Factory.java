package kosa.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Factory {
	//주문서를 자바 파일로 하겠음(xml 대신)
	@Bean
	//객체 생성
	public Dao oracleDao() {
		return new OracleDao();  // 메소드명이 id 명으로 됨 (oracleDao)
	}
	
	@Bean
	public Service writeService2() {
		return new WriteService();
	}
}
