package com.example.enjoytrip.weather.client;

import com.example.enjoytrip.weather.dto.WeatherRequestDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class WeatherClientIntegrationTest {

    @Autowired
    WeatherClient weatherClient;

    @Test
    void getVilageFcst(){
        // given
        int numOfRows = 50;
        int pageNo = 1;
        String dataType = "json";
        String baseDate = "20240516";
        String baseTime = "0500";
        int nx = 55;
        int ny = 127;

        WeatherRequestDto requestDto = WeatherRequestDto.builder()
                .numOfRows(numOfRows)
                .pageNo(pageNo)
                .dataType(dataType)
                .baseDate(baseDate)
                .baseTime(baseTime)
                .nx(nx)
                .ny(ny)
                .build();
        // when
        String response = weatherClient.getVilageFcst(requestDto);
        System.out.println(response);
        // then
        assertThat(response).isNotNull();
    }

}