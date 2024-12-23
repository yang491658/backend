package project.blobus.Backend.mypage.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import project.blobus.Backend.common.dto.PageRequestDTO;
import project.blobus.Backend.common.dto.PageResponseDTO;
import project.blobus.Backend.mypage.dto.CustomDTO;

import java.util.Map;

@SpringBootTest
class CustomServiceTest {
    private static final Logger log = LoggerFactory.getLogger(CustomServiceTest.class);
    @Autowired
    private CustomService service;

    @Test
    @DisplayName("커스텀 설정 불러오기 테스트")
    void test1() {
        String userId = "test3@test.com";

        Map<String, String> result = service.loadSetting(userId);
        log.info(result.toString());
    }

    @Test
    @DisplayName("커스텀 설정 저장 테스트")
    void test2() {
        String userId = "test3@test.com";
        String yListStr = "일자리/주거/창업";
        String rListStr = "전체/문화/지원";
        String kListStr = "기준/신청";

        service.saveSetting(userId, yListStr, rListStr, kListStr);
    }

    @Test
    @DisplayName("커스텀 정보 조회 테스트")
    public void test3() {
        String address = "서울특별시-북구";
        String yListStr = "";
        String rListStr = "";
        String kListStr = "참가신청";
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(1)
                .size(10)
                .build();
        PageResponseDTO<CustomDTO> result = service.getList(pageRequestDTO, address, yListStr, rListStr, kListStr);
        result.getDtoList().forEach(dto -> log.info(dto.toString()));
    }
}