package hello.springadvancedreview.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 스프링 3.2 매개변수 이름 인식 문제
 - Settings → Build, Execution, Deployment → Compiler → Java Compiler -> Additional command line 에 -parameters 추가
 */
@RestController
@RequiredArgsConstructor
public class OrderControllerV0 {

    private final OrderServiceV0 orderService;

    @GetMapping("/v0/request")
    public String request(String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }
}
