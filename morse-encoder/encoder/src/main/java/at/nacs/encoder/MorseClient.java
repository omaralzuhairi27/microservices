package at.nacs.encoder;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("morse")
public interface MorseClient {

  @PostMapping("/morse")
  String encode(String letter);
}
